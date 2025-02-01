package org.collage.practice5.chainofresponsibility2;

public class Client extends AccountHandler {
    private String clientName;

    public Client(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public void handleTransaction(Transaction transaction) {
        System.out.println("Client " + clientName + " reviewing transaction...");
        super.handleTransaction(transaction); // Передаємо запит далі
    }
}
