package org.collage.practice4.observer2;


public class PhoneNotifier implements Observer {
    private String phoneNumber;

    public PhoneNotifier(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(BankNotification notification) {
        System.out.println("PhoneNotifier [" + phoneNumber + "] received notification: " + notification.getMessage());
    }
}
