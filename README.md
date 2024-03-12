# Microservice Currency Converter

This project demonstrates a microservice architecture using Spring Boot, where we have implemented two main services: Currency Exchange Service and Currency Conversion Service. The application is further enhanced with service discovery using Netflix Eureka, centralized configuration with Spring Cloud Config, API gateway, security, and containerization.

## Services

- **Currency Exchange Service**: Provides currency exchange rates.
- **Currency Conversion Service**: Converts amounts from one currency to another using the Currency Exchange Service.
- **Naming Server (Netflix Eureka)**: Provides service discovery for microservices.
- **Spring Cloud Config Server**: Centralizes configuration management for microservices.

## Technologies

- Spring Boot
- Spring Cloud Config
- Spring Cloud Netflix Eureka
- Spring Cloud Gateway
- Spring Cloud OpenFeign
- Spring Security
- Docker
- Kubernetes

## Running the Application

### Prerequisites

- Java 11 or later
- Maven
- Docker
- Kubernetes (optional)

### Steps

1. **Start the Configuration Server**:
   - Navigate to the `spring-cloud-config-server` directory.
   - Run `mvn spring-boot:run` to start the config server.

2. **Start the Eureka Server**:
   - Navigate to the `naming-server` directory.
   - Run `mvn spring-boot:run` to start the Eureka server.

3. **Start the Currency Exchange Service**:
   - Navigate to the `currency-exchange-service` directory.
   - Run `mvn spring-boot:run` to start the service.

4. **Start the Currency Conversion Service**:
   - Navigate to the `currency-conversion-service` directory.
   - Run `mvn spring-boot:run` to start the service.

5. **Start the API Gateway**:
   - Navigate to the `api-gateway` directory.
   - Run `mvn spring-boot:run` to start the gateway.

### Accessing the Services

- Currency Exchange Service: `http://localhost:8000/currency-exchange/from/USD/to/INR`
- Currency Conversion Service: `http://localhost:8100/currency-conversion/from/USD/to/INR/quantity/10`
- API Gateway: `http://localhost:8765/currency-exchange/from/USD/to/INR`

