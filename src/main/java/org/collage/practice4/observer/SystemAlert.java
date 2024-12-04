package org.collage.practice4.observer;

import java.time.LocalDateTime;

public class SystemAlert extends Observable {
    private AlertSeverity severity;
    private String message;
    private int errorCode;
    private LocalDateTime timestamp;
    private String process;

    public SystemAlert (AlertSeverity severity, String message, int errorCode, String process)  {
        this.severity = severity;
        this.message = message;
        this.errorCode = errorCode;
        this.timestamp = LocalDateTime.now();
        this.process = process;
    }

    public AlertSeverity getSeverity() {
        return severity;
    }

    public String getMessage() {
        return message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getProcessName() {
        return process;
    }
}

