package org.collage.practice4.observer;

public class SysLogNotifier implements Observer {
    private String journalName;

    public SysLogNotifier(String journalName) {
        this.journalName = journalName;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("SysLogNotifier [" + journalName + "] logged alert: " + alert.getMessage());
    }
}
