package org.collage.practice2.builder2;

public class Main {
    public static void main(String[] args) {
        BankBuilder bankBuilder = new UkrainianBankBuilder();
        Bank bank = bankBuilder.setName("NovaBank").build();

        Client client1 = new Client("Olena Shevchenko", "olena@mail.com");
        Client client2 = new Client("Taras Petrenko", "taras@mail.com");

        bank.addClient(client1);
        bank.addClient(client2);

        Account account1 = new Account(1000);
        Account account2 = new Account(500);

        client1.addAccount(account1);
        client2.addAccount(account2);

        Transaction.transfer(account1, account2, 300);

        bank.displayClients();

        bank.removeClient(client1.getEmail());
        bank.displayClients();
    }
}
