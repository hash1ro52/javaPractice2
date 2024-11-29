package org.collage.practice3.command2;


public class TransferCommand extends AbstractCommand {
    private double amount;
    private Account fromAccount;
    private Account toAccount;

    public TransferCommand(Account fromAccount, Account toAccount, double amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    @Override
    public void execute() {
        if (fromAccount.withdraw(amount)) {
            toAccount.deposit(amount);
            System.out.println("Executed Transfer Command: Transferred " + amount + " from account " + fromAccount.getId() + " to account " + toAccount.getId());
        } else {
            System.out.println("Transfer Command Failed: Insufficient balance in account " + fromAccount.getId());
        }
    }

    @Override
    public void undo() {
        if (toAccount.withdraw(amount)) {
            fromAccount.deposit(amount);
            System.out.println("Undo Transfer Command: Reversed transfer of " + amount + " from account " + toAccount.getId() + " to account " + fromAccount.getId());
        }
    }
}
