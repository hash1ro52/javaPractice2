package org.collage.practice5.chainofresponsibility2;

public class Main {
    public static void main(String[] args) {
        // Create bank structure
        Bank bank = new Bank("bank1", "Global Bank", "123 Bank St");
        Client client1 = new Client("client1", "Alice");
        Client client2 = new Client("client2", "Bob");

        Account savingsAccount = new Account("savings1", "Savings", 1000.0);
        Account checkingAccount = new Account("checking1", "Checking", 500.0);

        // Build hierarchy
        client1.addAccount(savingsAccount);
        client2.addAccount(checkingAccount);
        bank.addAccount(client1);
        bank.addAccount(client2);

        // Process transactions
        BankManager manager = new BankManager(bank);
        manager.processAllTransactions();
    }
}
