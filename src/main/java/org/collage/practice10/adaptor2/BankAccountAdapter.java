package org.collage.practice10.adaptor2;

public class BankAccountAdapter {
    private BankAccount account;

    public BankAccountAdapter(BankAccount account) {
        this.account = account;
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public String withdraw(double amount) {
        return account.withdraw(amount) ? "Success" : "Failed: Insufficient funds";
    }

    public double getBalance() {
        return account.getBalance();
    }
}
