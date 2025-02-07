package org.collage.practice7.decorator2;

public class Main {
    public static void main(String[] args) {
        BankNotifier notifier = new BasicBankNotifier();
        notifier = new EmailBankNotifier(notifier);
        notifier = new SMSBankNotifier(notifier);

        notifier.notifyCustomer();
    }
}

