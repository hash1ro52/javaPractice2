package org.collage.practice6.strategy2;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("123456", 1000);
        Account account2 = new Account("654321", 500);

        BankController bankController = new BankController();

        bankController.setTransactionStrategy(new DepositStrategy());
        bankController.executeTransaction(account1, 200);

        bankController.setTransactionStrategy(new WithdrawStrategy());
        bankController.executeTransaction(account1, 300);

        bankController.setTransactionStrategy(new TransferStrategy(account2));
        bankController.executeTransaction(account1, 400);
        
        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());
    }
}
