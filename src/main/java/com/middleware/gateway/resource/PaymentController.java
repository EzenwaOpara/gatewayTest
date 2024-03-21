package com.middleware.gateway.resource;

import com.middleware.gateway.dto.GenericResponse;
import com.middleware.gateway.dto.TransactionRequest;
import com.middleware.gateway.dto.WebhookNotification;
import com.middleware.gateway.service.PaymentService;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Api(value = "Payment Management", description = "Operations pertaining to transactions and notifications in Payment Management")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/transaction/initiate")
    @ApiOperation(value = "Initiate a new transaction", response = GenericResponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successfully initiated transaction"),
            @ApiResponse(code = 401, message = "You are not authorized to initiate the transaction"),
            @ApiResponse(code = 400, message = "Invalid transaction request")
    })
    public ResponseEntity<GenericResponse> initiateTransaction(@ApiParam(value = "Transaction request body", required = true) @RequestBody @Validated TransactionRequest request) {
        GenericResponse response = paymentService.initiateTransaction(request);
        return new ResponseEntity<>(response, response.getStatus());
    }

    @GetMapping("/transaction/status/{transactionId}")
    @ApiOperation(value = "Check the status of a transaction", response = GenericResponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved transaction status"),
            @ApiResponse(code = 404, message = "Transaction not found")
    })
    public ResponseEntity<GenericResponse> checkTransactionStatus(@ApiParam(value = "Transaction ID to check status for", required = true) @PathVariable String transactionId) {
        GenericResponse response = paymentService.checkTransactionStatus(transactionId);
        return new ResponseEntity<>(response, response.getStatus());
    }

    @PostMapping("/webhook/notification")
    @ApiOperation(value = "Receive webhook notifications", response = GenericResponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Webhook notification received successfully"),
            @ApiResponse(code = 400, message = "Invalid webhook notification format"),
            @ApiResponse(code = 404, message = "Transaction not found")
    })
    public ResponseEntity<GenericResponse> receiveWebhookNotification(@ApiParam(value = "Webhook notification body", required = true) @RequestBody @Validated WebhookNotification notification) {
        GenericResponse response = paymentService.receiveWebhookNotification(notification);
        return new ResponseEntity<>(response, response.getStatus());
    }
}
