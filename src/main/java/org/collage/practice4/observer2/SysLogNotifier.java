package org.collage.practice4.observer2;


public class SysLogNotifier implements Observer {
    private String journalName;

    public SysLogNotifier(String journalName) {
        this.journalName = journalName;
    }

    @Override
    public void notify(BankNotification notification) {
        System.out.println("SysLogNotifier [" + journalName + "] logged notification: " + notification.getMessage());
    }
}

