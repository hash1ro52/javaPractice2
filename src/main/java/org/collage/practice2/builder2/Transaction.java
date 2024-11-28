package org.collage.practice2.builder2;

public class Transaction {
    public static boolean transfer(Account fromAccount, Account toAccount, double amount) {
        if (fromAccount.withdraw(amount)) {
            toAccount.deposit(amount);
            return true;
        }
        return false;
    }
}
