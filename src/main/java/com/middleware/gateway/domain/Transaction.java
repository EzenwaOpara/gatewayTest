package com.middleware.gateway.domain;

import com.middleware.gateway.dto.TransactionStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public class Transaction {
    private String senderAccount;
    private String recipientAccount;
    private BigDecimal amount;
    private LocalDateTime transactionDate = LocalDateTime.now();
    private String reference;
    private String narration;
    private TransactionStatus status;

    public Transaction() {
    }

    public Transaction(String senderAccount, String recipientAccount,
                       BigDecimal amount, LocalDateTime transactionDate,
                       String reference, String narration, TransactionStatus status) {
        this.senderAccount = senderAccount;
        this.recipientAccount = recipientAccount;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.reference = reference;
        this.narration = narration;
        this.status = status;
    }

    public String getSenderAccount() {
        return senderAccount;
    }

    public void setSenderAccount(String senderAccount) {
        this.senderAccount = senderAccount;
    }

    public String getRecipientAccount() {
        return recipientAccount;
    }

    public void setRecipientAccount(String recipientAccount) {
        this.recipientAccount = recipientAccount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getNarration() {
        return narration;
    }

    public void setNarration(String narration) {
        this.narration = narration;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "senderAccount='" + senderAccount + '\'' +
                ", recipientAccount='" + recipientAccount + '\'' +
                ", amount=" + amount +
                ", transactionDate=" + transactionDate +
                ", reference='" + reference + '\'' +
                ", narration='" + narration + '\'' +
                ", status=" + status +
                '}';
    }
}
