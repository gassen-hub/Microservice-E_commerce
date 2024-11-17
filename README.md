Project Overview
The Microservice E-commerce platform is designed to manage an online shopping experience with features like:

Customer registration and management
Product catalog management
Order processing and tracking
Email notifications for customers
Each feature is encapsulated within its own microservice, allowing for easy scaling and maintenance.

Architecture
The project uses a microservice architecture with each service responsible for a specific domain:

Customer Service: Manages customer data and operations.
Product Service: Manages product catalog and inventory.
Order Service: Handles order creation, updates, and tracking.
Email Notification Service: Sends emails to customers for order confirmations, updates, and other notifications.
Communication between microservices is handled using REST APIs, and data synchronization is maintained across different databases.

Technologies Used
Programming Language: Java (Spring Boot)
Databases:
MongoDB: Used for managing non-relational data.
PostgreSQL: Used for relational data management.
Email Service: Kanka (for handling email notifications)
Containerization: Docker (for containerizing microservices)
API Testing: Postman
Microservices
1. Customer Service
Manages customer information, including registration, login, and profile updates.
Uses PostgreSQL to store structured customer data.
2. Product Service
Handles product catalog, including CRUD operations for products.
Uses MongoDB to manage product data due to its flexible schema structure.
3. Order Service
Manages order creation, updates, and history.
Integrates with both the Customer and Product services to manage order-related data.
Uses PostgreSQL for relational order data management.
4. Email Notification Service
Sends email notifications to customers.
Uses Kanka to handle and dispatch emails.
Database Configuration
MongoDB: Used for flexible data models, suitable for managing product catalogs.
PostgreSQL: A reliable relational database for structured data like customers and orders.
