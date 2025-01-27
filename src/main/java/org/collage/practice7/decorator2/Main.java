package org.collage.practice7.decorator2;

public class Main {
    public static void main(String[] args) {
        BankAlert emailNotifier = new EmailBankNotifier("client@bank.com");
        BankAlert phoneNotifier = new PhoneBankNotifier("098-765-4321");
        BankAlert inAppNotifier = new InAppBankNotifier("client123");

        emailNotifier.notifyCustomer();
        phoneNotifier.notifyCustomer();
        inAppNotifier.notifyCustomer();
    }
}
