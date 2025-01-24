package org.collage.practice6.strategy2;

public class BankController {
    private TransactionStrategy strategy;

    public void setTransactionStrategy(TransactionStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeTransaction(Account account, double amount) {
        if (strategy != null) {
            strategy.executeTransaction(account, amount);
        } else {
            System.out.println("Transaction strategy is not set.");
        }
    }
}
