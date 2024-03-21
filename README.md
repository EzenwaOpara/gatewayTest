# Payment Gateway Middleware

This repository contains a mocked RESTful API simulating a simple payment gateway middleware. It facilitates transactions between a mock retail application and a banking service.

## Overview

The payment gateway middleware provides endpoints for initiating a transaction, checking transaction status, and receiving webhook notifications for transaction updates. It uses mock data to simulate transaction records and banking service responses, and incorporates basic authentication to secure the API endpoints.

## Implementation Details

- **Endpoints:**
  - `api/transaction/initiate`: POST endpoint for initiating a transaction.
  - `api/transaction/status/{transactionId}`: GET endpoint for checking transaction status.
  - `api/webhook/notification`: POST endpoint for receiving webhook notifications.

- **Authentication:**
  - Basic authentication is implemented to secure the API endpoints. Users must provide valid credentials to access the endpoints.
  - For test purpose:
      - username = admin
      - password = password

- **Data Simulation:**
  - Mock data or in-memory database is used to simulate transaction records and banking service responses.

- **Documentation:**
  - API endpoints are documented using Swagger, providing detailed information on request/response formats and authentication requirements.

## Evaluation Criteria

### 1. Clarity and Structure of the Code
- The code is structured logically, with clear separation of concerns.
- Naming conventions are consistent and descriptive.
- Comments are provided where necessary to explain complex logic or implementation details.

### 2. Effective Use of RESTful Principles and Patterns
- Endpoints follow RESTful principles, using appropriate HTTP methods and resource naming conventions.
- Response formats adhere to RESTful standards, providing meaningful status codes and response bodies.

### 3. Implementation of Secure Authentication
- Basic authentication is implemented securely.
- Access to endpoints is restricted to authenticated users only, ensuring data security.

## Instructions for Reviewing the API

To review the API implementation:
1. Clone this repository to your local machine.
2. Navigate to the directory where the repository was cloned.
3. Run the application and access the API endpoints using tools like cURL or Postman.
4. Refer to the Swagger documentation for detailed information on each endpoint and authentication requirements.
5. On your local machine, the swagger documentation can be accessed via http://localhost:8080/swagger-ui.html
