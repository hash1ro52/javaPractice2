package org.collage.practice9.proxy2;

public class BankController {
    private BankAccess bankAccess;

    public BankController(BankAccess bankAccess) {
        this.bankAccess = bankAccess;
    }

    public void makeTransaction() {
        System.out.println(bankAccess.processTransaction(1001));
    }

    public void confirmTransaction() {
        if (bankAccess.confirmTransaction()) {
            System.out.println("Transaction confirmed successfully!");
        }
    }

    public void cancelTransaction() {
        bankAccess.cancelTransaction();
    }
}
