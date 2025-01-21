package org.collage.practice5.chainofresponsibility2;

public class BankManager {
    private Bank bank;

    public BankManager(Bank bank) {
        this.bank = bank;
    }

    public void processAllTransactions() {
        if (bank != null) {
            bank.processTransaction();
        }
    }
}
