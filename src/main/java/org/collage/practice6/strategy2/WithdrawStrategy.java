package org.collage.practice6.strategy2;

public class WithdrawStrategy implements TransactionStrategy {
    @Override
    public void executeTransaction(Account account, double amount) {
        if (account.getBalance() >= amount) {
            account.updateBalance(-amount);
            System.out.println("Withdrew " + amount + " from account " + account.getAccountNumber());
        } else {
            System.out.println("Insufficient funds in account " + account.getAccountNumber());
        }
    }
}
