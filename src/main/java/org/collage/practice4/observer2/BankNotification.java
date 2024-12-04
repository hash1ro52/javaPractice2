package org.collage.practice4.observer2;

import java.time.LocalDateTime;

public class BankNotification extends Observable {
    private NotificationSeverity severity;
    private String message;
    private int transactionCode;
    private LocalDateTime timestamp;
    private String source;

    public BankNotification(NotificationSeverity severity, String message, int transactionCode, String source) {
        this.severity = severity;
        this.message = message;
        this.transactionCode = transactionCode;
        this.timestamp = LocalDateTime.now();
        this.source = source;
    }

    public NotificationSeverity getSeverity() {
        return severity;
    }

    public String getMessage() {
        return message;
    }

    public int getTransactionCode() {
        return transactionCode;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getSource() {
        return source;
    }
}
