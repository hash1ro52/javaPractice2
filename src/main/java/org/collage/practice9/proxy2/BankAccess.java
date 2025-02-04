package org.collage.practice9.proxy2;

public interface BankAccess {
    String processTransaction(int transactionId);
    boolean confirmTransaction();
    void cancelTransaction();
}

