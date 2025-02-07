package org.collage.practice7.decorator2;

public class SMSBankNotifier extends BankNotifierDecorator {
    public SMSBankNotifier(BankNotifier wrappedNotifier) {
        super(wrappedNotifier);
    }

    @Override
    public void notifyCustomer() {
        super.notifyCustomer();
        System.out.println("Уведомление отправлено через SMS.");
    }
}
