package org.collage.practice3.command2;

public class Main {
    public static void main(String[] args) {
        BankController controller = new BankController();

        Account account1 = new Account(1000);
        Account account2 = new Account(500);

        DepositCommand depositCommand = new DepositCommand(account1, 200);
        WithdrawCommand withdrawCommand = new WithdrawCommand(account1, 150);
        TransferCommand transferCommand = new TransferCommand(account1, account2, 300);

        controller.addCommand(depositCommand);
        controller.addCommand(withdrawCommand);
        controller.addCommand(transferCommand);

        System.out.println("Executing all commands:");
        controller.executeAllPendingCommands();

        System.out.println("\nUndoing last 2 commands:");
        controller.undoCommand(2);
    }
}
