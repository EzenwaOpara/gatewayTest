package com.middleware.gateway.dto;

public class TransactionResponse {
    private String transactionId;
    private TransactionStatus status;

    public TransactionResponse() {
    }

    public TransactionResponse(String transactionId, TransactionStatus status) {
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
        return "TransactionStatusResponse{" +
                "transactionId='" + transactionId + '\'' +
                ", status=" + status +
                '}';
    }
}
