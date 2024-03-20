package com.middleware.gateway.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

public class TransactionRequest {
    @NotEmpty(message = "Sender account number cannot be empty")
    private String senderAccount;
    @NotEmpty(message = "Recipient account number cannot be empty")
    private String recipientAccount;
    @Positive(message = "Amount must be a positive number greater than 0")
    private BigDecimal amount;

    private String narration;

    public TransactionRequest() {
    }

    public TransactionRequest(String senderAccount, String recipientAccount, BigDecimal amount, String narration) {
        this.senderAccount = senderAccount;
        this.recipientAccount = recipientAccount;
        this.amount = amount;
        this.narration = narration;
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

    public String getNarration() {
        return narration;
    }

    public void setNarration(String narration) {
        this.narration = narration;
    }

    @Override
    public String toString() {
        return "TransactionRequest{" +
                "senderAccount='" + senderAccount + '\'' +
                ", recipientAccount='" + recipientAccount + '\'' +
                ", amount=" + amount +
                ", narration='" + narration + '\'' +
                '}';
    }
}
