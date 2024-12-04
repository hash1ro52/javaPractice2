package org.collage.practice4.observer;

public class Main {
    public static void main(String[] args) {
        SystemController controller = new SystemController();

        EmailNotifier emailNotifier = new EmailNotifier("support@company.com");
        TelegramNotifier telegramNotifier = new TelegramNotifier("user123", false);
        PhoneNotifier phoneNotifier = new PhoneNotifier("+123456789");
        SysLogNotifier logNotifier = new SysLogNotifier("SystemLog");

        controller.subscribe(emailNotifier);
        controller.subscribe(telegramNotifier);
        controller.subscribe(phoneNotifier);
        controller.subscribe(logNotifier);

        SystemAlert alert1 = new SystemAlert(AlertSeverity.WARNING, "Low disk space", 1001, "DiskMonitor");
        SystemAlert alert2 = new SystemAlert(AlertSeverity.CRITICAL, "Database connection lost", 2001, "DBService");

        controller.addAlert(alert1);
        controller.addAlert(alert2);
    }
}
