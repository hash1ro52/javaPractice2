package org.collage.practice5.chainofresponsibility2;

public class Bank extends AccountComponent {
    private String bankName;
    private String address;

    public Bank(String name, String bankName, String address) {
        this.name = name;
        this.bankName = bankName;
        this.address = address;
    }

    @Override
    public void processTransaction() {
        System.out.println("Processing transactions for Bank: " + bankName);
        processSubAccounts();
    }

    private void processSubAccounts() {
        for (AccountComponent account : subAccounts) {
            account.processTransaction();
        }
    }
}
