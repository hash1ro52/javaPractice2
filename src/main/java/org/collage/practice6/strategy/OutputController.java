package org.collage.practice6.strategy;

public class OutputController {
    private OutputStrategy strategy;

    public void setStrategy(OutputStrategy strategy) {
        this.strategy = strategy;
    }

    public void printReport(Document document) {
        if (strategy != null) {
            strategy.printReport(document.getName());
        }
    }

    public void sendReportViaMail(Document document) {
        if (strategy != null) {
            strategy.sendReportViaMail(document.getName());
        }
    }

    public void sendReportViaTelegram(Document document) {
        if (strategy != null) {
            strategy.sendReportViaTelegram(document.getName());
        }
    }
}
