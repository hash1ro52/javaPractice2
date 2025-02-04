package org.collage.practice9.proxy2;

public class BankSystem implements BankAccess {
    private String systemName;
    private boolean isAvailable;

    public BankSystem(String systemName) {
        this.systemName = systemName;
        this.isAvailable = true;
    }

    @Override
    public String processTransaction(int transactionId) {
        return "Processing transaction #" + transactionId + " in " + systemName;
    }

    @Override
    public boolean confirmTransaction() {
        return true;
    }

    @Override
    public void cancelTransaction() {
        System.out.println("Transaction canceled");
    }
}

