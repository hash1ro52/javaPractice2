package org.collage.practice5.chainofresponsibility2;

public class Account extends AccountComponent {
    private String accountType;
    private double balance;

    public Account(String name, String accountType, double balance) {
        this.name = name;
        this.accountType = accountType;
        this.balance = balance;
    }

    @Override
    public void processTransaction() {
        System.out.println("Processing Account: " + name +
                " (Type: " + accountType + ", Balance: $" + balance + ")");
    }
}
