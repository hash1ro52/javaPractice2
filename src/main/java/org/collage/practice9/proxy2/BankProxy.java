package org.collage.practice9.proxy2;

public class BankProxy implements BankAccess {
    private BankSystem bankSystem;

    public BankProxy(String systemName) {
        this.bankSystem = new BankSystem(systemName);
    }

    @Override
    public String processTransaction(int transactionId) {
        System.out.println("[LOG] Checking transaction #" + transactionId);
        String result = bankSystem.processTransaction(transactionId);
        System.out.println("[LOG] Transaction processed");
        return result;
    }

    @Override
    public boolean confirmTransaction() {
        System.out.println("[LOG] Confirming transaction...");
        return bankSystem.confirmTransaction();
    }

    @Override
    public void cancelTransaction() {
        System.out.println("[LOG] Cancelling transaction...");
        bankSystem.cancelTransaction();
    }
}
