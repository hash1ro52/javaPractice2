package org.collage.practice4.observer;

import java.util.ArrayList;
import java.util.List;

public class SystemController extends Observable {
    private List<SystemAlert> alertHistory = new ArrayList<>();

    public void addAlert(SystemAlert alert) {
        alertHistory.add(alert);
        notifyObservers(alert);
    }

    public List<SystemAlert> getAlertHistory() {
        return alertHistory;
    }
}

