package org.collage.practice6.strategy;

public class LinuxOutputStrategy implements OutputStrategy {
    @Override
    public void printReport(String documentName) {
        System.out.println("Linux: Printing " + documentName);
    }

    @Override
    public void sendReportViaMail(String documentName) {
        System.out.println("Linux: Sending " + documentName + " via Mail");
    }

    @Override
    public void sendReportViaTelegram(String documentName) {
        System.out.println("Linux: Sending " + documentName + " via Telegram");
    }
}
