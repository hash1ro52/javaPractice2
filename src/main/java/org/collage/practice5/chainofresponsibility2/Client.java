package org.collage.practice5.chainofresponsibility2;

public class Client extends AccountComponent {
    private String clientName;

    public Client(String name, String clientName) {
        this.name = name;
        this.clientName = clientName;
    }

    @Override
    public void processTransaction() {
        System.out.println("Processing transactions for Client: " + clientName);
        for (AccountComponent account : subAccounts) {
            account.processTransaction();
        }
    }
}
