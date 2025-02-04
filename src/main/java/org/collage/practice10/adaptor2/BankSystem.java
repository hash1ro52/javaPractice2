package org.collage.practice10.adaptor2;

public class BankSystem {
    private BankAccountAdapter accountAdapter;

    public BankSystem(BankAccountAdapter accountAdapter) {
        this.accountAdapter = accountAdapter;
    }

    public void performOperations() {
        accountAdapter.deposit(500);
        System.out.println(accountAdapter.withdraw(700));
        System.out.println("Balance: " + accountAdapter.getBalance());
    }
}
