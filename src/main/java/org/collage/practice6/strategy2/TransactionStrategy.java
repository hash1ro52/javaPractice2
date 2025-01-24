package org.collage.practice6.strategy2;

public interface TransactionStrategy {
    void executeTransaction(Account account, double amount);
}
