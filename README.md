# Microservice E-commerce Project

A scalable microservice-based e-commerce platform that manages customers, products, orders, and email notifications. It uses Spring Boot, PostgreSQL, and MongoDB, with Kanka for email notifications, ensuring efficient and flexible service management.


## Project Overview
The Microservice E-commerce platform offers features such as customer management, product catalog management, order processing, and automated email notifications, all encapsulated within a microservice architecture.

## Architecture
The project is divided into multiple microservices:
- **Customer Service**: Handles customer data using PostgreSQL.
- **Product Service**: Manages product catalogs with MongoDB.
- **Order Service**: Processes and tracks orders with PostgreSQL.
- **Email Notification Service**: Sends automated emails using Kanka.

Microservices communicate via REST APIs, ensuring separation of concerns and easy scaling.

## Technologies Used
- **Programming Language**: Java (Spring Boot)
- **Databases**: MongoDB and PostgreSQL
- **Email Service**: Kanka
- **Containerization**: Docker
- **API Testing**: Postman

## Microservices
1. **Customer Service**: Manages user data and authentication.
2. **Product Service**: CRUD operations for product catalog.
3. **Order Service**: Handles order lifecycle and tracking.
4. **Email Notification Service**: Manages and sends email notifications.

## Database Configuration
- **MongoDB**: Used for product data.
- **PostgreSQL**: Used for customer and order data.

## Setup and Installation
1. **Clone the repository**:
   ```bash
   git clone https://github.com/gassen-hub/Microservice-E_commerce.git
