package com.middleware.gateway.service;

import com.middleware.gateway.dto.GenericResponse;
import com.middleware.gateway.dto.TransactionRequest;
import com.middleware.gateway.dto.WebhookNotification;

public interface PaymentService {
    GenericResponse initiateTransaction(TransactionRequest request);

    GenericResponse checkTransactionStatus(String transactionId);

    GenericResponse receiveWebhookNotification(WebhookNotification notification);
}
