package org.collage.practice4.observer;

public class EmailNotifier implements Observer {
    private String uniqueName;

    public EmailNotifier(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("EmailNotifier [" + uniqueName + "] received alert: " + alert.getMessage());
    }
}

