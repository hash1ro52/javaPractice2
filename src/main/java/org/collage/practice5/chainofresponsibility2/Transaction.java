package org.collage.practice5.chainofresponsibility2;

public class Transaction {
    private String description;
    private double amount;

    public Transaction(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public void execute(Account account) {
        System.out.println("Executing transaction: " + description + " Amount: $" + amount);
        // Example logic: deduct amount from account
    }
}
