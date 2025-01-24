package org.collage.practice6.strategy;

public class WindowsOutputStrategy implements OutputStrategy {
    @Override
    public void printReport(String documentName) {
        System.out.println("Windows: Printing " + documentName);
    }

    @Override
    public void sendReportViaMail(String documentName) {
        System.out.println("Windows: Sending " + documentName + " via Mail");
    }

    @Override
    public void sendReportViaTelegram(String documentName) {
        System.out.println("Windows: Sending " + documentName + " via Telegram");
    }
}
