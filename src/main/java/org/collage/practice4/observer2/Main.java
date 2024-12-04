package org.collage.practice4.observer2;

public class Main {
    public static void main(String[] args) {
        BankSystemController controller = new BankSystemController();

        EmailNotifier emailNotifier = new EmailNotifier("support@bank.com");
        TelegramNotifier telegramNotifier = new TelegramNotifier("client123", true);
        PhoneNotifier phoneNotifier = new PhoneNotifier("+987654321");
        SysLogNotifier logNotifier = new SysLogNotifier("BankTransactionLog");

        controller.subscribe(emailNotifier);
        controller.subscribe(telegramNotifier);
        controller.subscribe(phoneNotifier);
        controller.subscribe(logNotifier);

        BankNotification notification1 = new BankNotification(NotificationSeverity.WARNING, "Low account balance", 3001, "AccountMonitor");
        BankNotification notification2 = new BankNotification(NotificationSeverity.CRITICAL, "Fraudulent transaction detected", 4002, "FraudDetection");

        controller.addNotification(notification1);
        controller.addNotification(notification2);
    }
}
