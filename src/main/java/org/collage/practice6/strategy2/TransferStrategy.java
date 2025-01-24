package org.collage.practice6.strategy2;

public class TransferStrategy implements TransactionStrategy {
    private Account targetAccount;

    public TransferStrategy(Account targetAccount) {
        this.targetAccount = targetAccount;
    }

    @Override
    public void executeTransaction(Account account, double amount) {
        if (account.getBalance() >= amount) {
            account.updateBalance(-amount);
            targetAccount.updateBalance(amount);
            System.out.println("Transferred " + amount + " from account " + account.getAccountNumber() +
                    " to account " + targetAccount.getAccountNumber());
        } else {
            System.out.println("Insufficient funds for transfer from account " + account.getAccountNumber());
        }
    }
}
