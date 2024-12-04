package org.collage.practice4.observer2;


import java.util.ArrayList;
import java.util.List;

public class BankSystemController extends Observable {
    private List<BankNotification> notificationHistory = new ArrayList<>();

    public void addNotification(BankNotification notification) {
        notificationHistory.add(notification);
        notifyObservers(notification);
    }

    public List<BankNotification> getNotificationHistory() {
        return notificationHistory;
    }
}
