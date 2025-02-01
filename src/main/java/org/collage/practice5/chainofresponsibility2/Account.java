package org.collage.practice5.chainofresponsibility2;


public class Account extends AccountHandler {
    private String accountType;
    private double balance;

    public Account(String accountType, double balance) {
        this.accountType = accountType;
        this.balance = balance;
    }

    @Override
    public void handleTransaction(Transaction transaction) {
        if (balance >= transaction.getAmount()) {
            balance -= transaction.getAmount();
            System.out.println("Transaction approved! New balance: $" + balance);
        } else {
            System.out.println("Transaction denied: insufficient funds.");
        }
    }
}
