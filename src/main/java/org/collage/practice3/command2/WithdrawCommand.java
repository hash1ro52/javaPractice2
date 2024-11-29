package org.collage.practice3.command2;


public class WithdrawCommand extends AbstractCommand {
    private double amount;
    private Account account;

    public WithdrawCommand(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        if (account.withdraw(amount)) {
            System.out.println("Executed Withdraw Command: Withdrawn " + amount + " from account " + account.getId());
        } else {
            System.out.println("Withdraw Command Failed: Insufficient balance in account " + account.getId());
        }
    }

    @Override
    public void undo() {
        account.deposit(amount);
        System.out.println("Undo Withdraw Command: Deposited " + amount + " back to account " + account.getId());
    }
}
