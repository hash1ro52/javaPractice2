package org.collage.practice8.visitor1;

public class BankAccount extends Account {
    private User owner;
    private double balance;

    public BankAccount(User owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String accept(BankVisitor visitor) {
        return visitor.visit(this);
    }
}
