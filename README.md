# 🛒 MegaMart Application

## Overview 📋
The MegaMart application is a simple e-commerce platform that allows users to perform CRUD (Create, Read, Update, Delete) operations on product data. It includes features for managing products and querying them based on various criteria.

## Features ✨
- **CRUD Operations**: Create, Read, Update, and Delete products.
- **Custom Queries**: Custom queries to search products based on different criteria.

## Technologies Used 🛠️
- **Spring Boot**: Framework for building the application.
- **MySQL**: Database for storing product information.
- **Eclipse**: IDE used for development.
- **Postman**: Tool for testing the API endpoints.

### Prerequisites ✅
- JDK 11 or higher
- MySQL Server
- Eclipse IDE
- Postman

**The MegaMart application supports the following CRUD operations:**

- **Create** 🆕: Add new products to the database.
- **Read** 📖: Retrieve product details by querying the database.
- **Update** ✏️: Modify existing product details.
- **Delete** 🗑️: Remove products from the database.

### Custom Queries 🔍

The application includes several custom queries to retrieve data based on specific criteria:

 **For Example - Find Products by Price**
   ```java
   @Query("SELECT p FROM Product p WHERE p.productPrice = :productPrice")
   List<Product> findByProductPrice(@Param("productPrice") float productPrice);
