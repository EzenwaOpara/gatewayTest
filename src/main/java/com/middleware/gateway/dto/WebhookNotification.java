package com.middleware.gateway.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class WebhookNotification {
    @NotEmpty(message = "Transaction Id must not be empty")
    private String transactionId;
    @NotNull(message = "Transaction status must not be null")
    private TransactionStatus status;

    public WebhookNotification() {
    }

    public WebhookNotification(String transactionId, TransactionStatus status) {
        this.transactionId = transactionId;
        this.status = status;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "WebhookNotification{" +
                "transactionId='" + transactionId + '\'' +
                ", status=" + status +
                '}';
    }
}
