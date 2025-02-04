package org.collage.practice10.adaptor2;

public class Main {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(1000);
        BankSystem bank1 = new BankSystem(new BankAccountAdapter(savings));
        bank1.performOperations();

        BankAccount checking = new CheckingAccount(500, 200);
        BankSystem bank2 = new BankSystem(new BankAccountAdapter(checking));
        bank2.performOperations();
    }
}
