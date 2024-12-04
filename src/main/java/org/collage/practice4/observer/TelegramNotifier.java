package org.collage.practice4.observer;

 public class TelegramNotifier implements Observer {
    private String userId;
    private boolean isSilent;

    public TelegramNotifier(String userId, boolean isSilent) {
        this.userId = userId;
        this.isSilent = isSilent;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("TelegramNotifier [" + userId + "] received alert: " + alert.getMessage());
    }
}


