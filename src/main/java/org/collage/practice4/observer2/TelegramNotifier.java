package org.collage.practice4.observer2;


public class TelegramNotifier implements Observer {
    private String userId;
    private boolean isSilent;

    public TelegramNotifier(String userId, boolean isSilent) {
        this.userId = userId;
        this.isSilent = isSilent;
    }

    @Override
    public void notify(BankNotification notification) {
        System.out.println("TelegramNotifier [" + userId + "] received notification: " + notification.getMessage());
    }
}
