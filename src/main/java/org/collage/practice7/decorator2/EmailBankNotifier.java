package org.collage.practice7.decorator2;

public class EmailBankNotifier extends BankNotifierDecorator {
    public EmailBankNotifier(BankNotifier wrappedNotifier) {
        super(wrappedNotifier);
    }

    @Override
    public void notifyCustomer() {
        super.notifyCustomer();
        System.out.println("Уведомление отправлено на Email.");
    }
}

