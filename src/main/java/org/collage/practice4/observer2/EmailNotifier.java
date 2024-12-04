package org.collage.practice4.observer2;


public class EmailNotifier implements Observer {
    private String uniqueName;

    public EmailNotifier(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    @Override
    public void notify(BankNotification notification) {
        System.out.println("EmailNotifier [" + uniqueName + "] received notification: " + notification.getMessage());
    }
}
