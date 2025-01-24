package org.collage.practice6.strategy;

public interface OutputStrategy {
    void printReport(String documentName);
    void sendReportViaMail(String documentName);
    void sendReportViaTelegram(String documentName);
}
