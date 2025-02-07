package org.collage.practice7.decorator2;

public class BasicBankNotifier implements BankNotifier {
    @Override
    public void notifyCustomer() {
        System.out.println("Уведомление в интернет-банке.");
    }
}
