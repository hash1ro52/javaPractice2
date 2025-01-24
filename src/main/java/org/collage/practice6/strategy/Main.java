package org.collage.practice6.strategy;

public class Main {
    public static void main(String[] args) {
        Document document = new Document("Report.pdf");

        OutputController controller = new OutputController();

        controller.setStrategy(new WindowsOutputStrategy());

        controller.printReport(document);
        controller.sendReportViaMail(document);

        controller.setStrategy(new LinuxOutputStrategy());

        controller.sendReportViaTelegram(document);
    }
}
