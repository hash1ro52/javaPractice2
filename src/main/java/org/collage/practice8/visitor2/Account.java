package org.collage.practice8.visitor2;

public class Account {
    private User owner;
    private double balance;

    public Account(User owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public User getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public String accept(BankVisitor visitor) {
        return visitor.visit(this);
    }
}
