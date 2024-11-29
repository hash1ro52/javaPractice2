package org.collage.practice3.command2;


public class DepositCommand extends AbstractCommand {
    private double amount;
    private Account account;

    public DepositCommand(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.deposit(amount);
        System.out.println("Executed Deposit Command: Deposited " + amount + " to account " + account.getId());
    }

    @Override
    public void undo() {
        account.withdraw(amount);
        System.out.println("Undo Deposit Command: Withdrawn " + amount + " from account " + account.getId());
    }
}
