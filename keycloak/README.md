# Securing Spring Boot 3 REST API with Keycloak

## 1. Project Overview

This project demonstrates how to secure a Spring Boot 3 REST API using **Keycloak (OAuth2 / JWT authentication)**. It implements **Role-Based Access Control (RBAC)** using tokens issued by Keycloak.

---

## 2. Objective

* Secure REST APIs using Keycloak JWT tokens
* Implement Role-Based Access Control (admin / user roles)
* Map Keycloak client roles into Spring Security authorities using a custom JWT converter

---

## 3. Tech Stack

* Java 21
* Spring Boot 3.5.x
* Spring Security (OAuth2 Resource Server)
* Keycloak 26.x
* Docker

---

## 4. API Endpoints

### Admin Role

* `GET /api/v1/demo/hello-1`
* Response: `Hello from spring boot and keycloak user`

### User Role

* `GET /api/v1/demo/hello-2`
* Response: `Hello2 from spring boot and keycloak admin`

### Security Rules

* No token → `401 Unauthorized`
* Wrong role → `403 Forbidden`

---

## 5. Keycloak Configuration

### Realm

* `rajitha_realm`

### Client

* `rajitha-rest-api`
* Public client enabled
* Direct Access Grants enabled

### Roles

* `admin`
* `user`

### Users

* `admin_user` → admin role
* `standard_user` → user role

---

## 6. How to Build

```bash
./mvnw clean compile
```

---

## 7. How to Run

### Step 1: Start Keycloak

```bash
docker-compose up -d
```

Keycloak URL:

```
http://localhost:8080
```

Default credentials:

```
admin / admin
```

---

### Step 2: Start Spring Boot Application

```bash
./mvnw spring-boot:run
```

Application URL:

```
http://localhost:8081
```

---

## 8. Get Access Token

```bash
curl -X POST "http://localhost:8080/realms/rajitha_realm/protocol/openid-connect/token" \
 -H "Content-Type: application/x-www-form-urlencoded" \
 -d "client_id=rajitha-rest-api" \
 -d "username=admin_user" \
 -d "password=password" \
 -d "grant_type=password"
```

---

## 9. Call API

```bash
curl -X GET "http://localhost:8081/api/v1/demo/hello-1" \
 -H "Authorization: Bearer <ACCESS_TOKEN>"
```

---

## 10. Expected Behavior

* Valid role → `200 OK`
* Missing role → `403 Forbidden`
* No token → `401 Unauthorized`
