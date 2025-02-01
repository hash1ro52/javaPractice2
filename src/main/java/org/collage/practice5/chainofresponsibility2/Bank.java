package org.collage.practice5.chainofresponsibility2;

public class Bank extends AccountHandler {
    private String bankName;
    private String address;

    public Bank(String bankName, String address) {
        this.bankName = bankName;
        this.address = address;
    }

    @Override
    public void handleTransaction(Transaction transaction) {
        System.out.println("Bank " + bankName + " processing transaction...");
        super.handleTransaction(transaction); // Передаємо запит далі
    }
}
