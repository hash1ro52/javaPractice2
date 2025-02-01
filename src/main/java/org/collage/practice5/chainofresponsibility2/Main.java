package org.collage.practice5.chainofresponsibility2;


public class Main {
    public static void main(String[] args) {
        // Створюємо рівні ланцюжка
        Bank bank = new Bank("Global Bank", "123 Bank St");
        Client client = new Client("Alice");
        Account account = new Account("Savings", 1000.0);

        bank.setNextHandler(client);
        client.setNextHandler(account);

        Transaction transaction = new Transaction("Purchase", 200.0);

        bank.handleTransaction(transaction);
    }
}
