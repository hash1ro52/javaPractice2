package org.collage.practice6.strategy2;

public class DepositStrategy implements TransactionStrategy {
    @Override
    public void executeTransaction(Account account, double amount) {
        account.updateBalance(amount);
        System.out.println("Deposited " + amount + " to account " + account.getAccountNumber());
    }
}
