package org.collage.practice2.builder2;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private final String name;
    private final String email;
    private final List<Account> accounts;

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return new ArrayList<>(accounts);
    }

    @Override
    public String toString() {
        return "Client{name='" + name + "', email='" + email + "', accounts=" + accounts + "}";
    }
}
