# StoryChime Project Documentation

## Overview
**StoryChime** is a microservices-based application designed to generate visual content from user inputs, assemble videos, manage media storage, and handle user authentication. The project uses Spring Boot and Spring Cloud for building and managing microservices, with Eureka for service discovery.

## Project Structure

```
StoryChime/
│
├── api-gateway/                                    # API Gateway Service
│   ├── src/
│   │   ├── main/java/com/storychime/apigateway/   # Java package for API Gateway
│   │   │   └── ApiGatewayApplication.java         # Main application class for API Gateway
│   ├── pom.xml                                     # Maven or Gradle file
│   └── application.properties                       # Configuration for API Gateway
│
├── content-generation-service/                     # Content Generation Service
│   ├── src/
│   │   ├── main/java/com/storychime/content/       # Java package for Content Generation
│   │   │   ├── controller/                         # Controller classes
│   │   │   │   └── ContentController.java         # Handles content generation requests
│   │   │   ├── model/                              # Model classes
│   │   │   │   └── ContentRequest.java            # Represents a content generation request
│   │   │   └── service/                            # Service classes
│   │   │       └── ContentService.java            # Contains business logic for content generation
│   ├── pom.xml                                     # Maven or Gradle file
│   └── application.properties                       # Configuration for Content Generation Service
│
├── video-assembly-service/                         # Video Assembly Service
│   ├── src/
│   │   ├── main/java/com/storychime/assembly/      # Java package for Video Assembly
│   │   │   ├── controller/                         # Controller classes
│   │   │   │   └── VideoAssemblyController.java   # Handles video assembly requests
│   │   │   ├── model/                              # Model classes
│   │   │   │   └── VideoRequest.java              # Represents a video assembly request
│   │   │   └── service/                            # Service classes
│   │   │       └── VideoAssemblyService.java      # Contains business logic for video assembly
│   ├── pom.xml                                     # Maven or Gradle file
│   └── application.properties                       # Configuration for Video Assembly Service
│
├── storage-service/                                # Storage Service
│   ├── src/
│   │   ├── main/java/com/storychime/storage/       # Java package for Storage
│   │   │   ├── controller/                         # Controller classes
│   │   │   │   └── StorageController.java         # Handles storage requests
│   │   │   ├── model/                              # Model classes
│   │   │   │   └── MediaUploadRequest.java        # Represents a media upload request
│   │   │   └── service/                            # Service classes
│   │   │       └── StorageService.java            # Contains business logic for media storage
│   ├── pom.xml                                     # Maven or Gradle file
│   └── application.properties                       # Configuration for Storage Service
│
├── user-management-service/                        # User Management Service
│   ├── src/
│   │   ├── main/java/com/storychime/user/          # Java package for User Management
│   │   │   ├── controller/                         # Controller classes
│   │   │   │   └── UserController.java            # Handles user-related requests
│   │   │   ├── model/                              # Model classes
│   │   │   │   └── User.java                       # Represents a user entity
│   │   │   └── service/                            # Service classes
│   │   │       └── UserService.java               # Contains business logic for user management
│   ├── pom.xml                                     # Maven or Gradle file
│   └── application.properties                       # Configuration for User Management Service
│
├── service-registry/                               # Service Registry (Eureka)
│   ├── src/
│   │   ├── main/java/com/storychime/registry/      # Java package for Service Registry
│   │   │   └── RegistryApplication.java           # Main application class for Service Registry
│   ├── pom.xml                                     # Maven or Gradle file
│   └── src/main/resources/application.properties    # Configuration for Service Registry
│
└── README.md                                       # Project documentation
```

## Component Descriptions

### 1. **API Gateway**
- **Purpose**: Manages request routing and load balancing for the microservices.
- **Technologies**: Spring Cloud Gateway, Eureka Client.
- **Key Classes**:
  - `ApiGatewayApplication.java`: Main application class for initializing the API Gateway.

### 2. **Content Generation Service**
- **Purpose**: Generates visual content based on user input.
- **Technologies**: Spring Boot, Eureka Client.
- **Key Classes**:
  - `ContentController.java`: Handles content generation requests.
  - `ContentService.java`: Contains business logic for processing content generation.

### 3. **Video Assembly Service**
- **Purpose**: Assembles videos from provided media.
- **Technologies**: Spring Boot, Eureka Client.
- **Key Classes**:
  - `VideoAssemblyController.java`: Handles video assembly requests.
  - `VideoAssemblyService.java`: Contains business logic for video assembly.

### 4. **Storage Service**
- **Purpose**: Manages media uploads and storage.
- **Technologies**: Spring Boot, Eureka Client.
- **Key Classes**:
  - `StorageController.java`: Handles storage requests.
  - `StorageService.java`: Contains business logic for media storage.

### 5. **User Management Service**
- **Purpose**: Manages user accounts and authentication.
- **Technologies**: Spring Boot, Eureka Client.
- **Key Classes**:
  - `UserController.java`: Handles user-related requests.
  - `UserService.java`: Contains business logic for user management.

### 6. **Service Registry (Eureka)**
- **Purpose**: Manages the registration of all microservices.
- **Technologies**: Spring Cloud Netflix Eureka.
- **Key Classes**:
  - `RegistryApplication.java`: Main application class for the service registry.

## Getting Started
To run the project locally:
1. Ensure you have Java and Maven installed.
2. Start the service registry (Eureka).
3. Start each microservice in their respective order: content generation, video assembly, storage, and user management.
4. Use the API Gateway to interact with the services.

## Conclusion
This project structure ensures a modular design, facilitating the independent development and deployment of each service. If you have any further questions or need additional documentation, feel free to ask!
