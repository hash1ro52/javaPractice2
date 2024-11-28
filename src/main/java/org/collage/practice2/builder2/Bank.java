package org.collage.practice2.builder2;

import java.util.HashMap;

public class Bank {
    private final String name;
    private final HashMap<String, Client> clients;

    public Bank(String name) {
        this.name = name;
        this.clients = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public boolean addClient(Client client) {
        if (!clients.containsKey(client.getEmail())) {
            clients.put(client.getEmail(), client);
            return true;
        }
        return false;
    }

    public boolean removeClient(String email) {
        return clients.remove(email) != null;
    }

    public Client getClient(String email) {
        return clients.get(email);
    }

    public void displayClients() {
        clients.values().forEach(System.out::println);
    }
}
