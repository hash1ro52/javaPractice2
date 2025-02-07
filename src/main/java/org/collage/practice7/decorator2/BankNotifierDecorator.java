package org.collage.practice7.decorator2;

public abstract class BankNotifierDecorator implements BankNotifier {
    protected BankNotifier wrappedNotifier;

    public BankNotifierDecorator(BankNotifier wrappedNotifier) {
        this.wrappedNotifier = wrappedNotifier;
    }

    @Override
    public void notifyCustomer() {
        wrappedNotifier.notifyCustomer();
    }
}
