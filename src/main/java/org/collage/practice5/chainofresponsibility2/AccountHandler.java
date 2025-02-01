package org.collage.practice5.chainofresponsibility2;



public abstract class AccountHandler {
    protected AccountHandler nextHandler;

    public void setNextHandler(AccountHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleTransaction(Transaction transaction) {
        if (nextHandler != null) {
            nextHandler.handleTransaction(transaction);
        } else {
            System.out.println("Transaction could not be processed.");
        }
    }
}
