# StoryChime Project Structure Documentation

## Overview
The **StoryChime** project is organized into a modular structure to facilitate the development and maintenance of its microservices. This document outlines the structure of the backend project, **StoryChimeAPI**, including its components and their purposes.

## Project Structure

```
StoryChimeAPI/                             # Backend project
│
├── api-gateway/                           # API Gateway Service
│   ├── src/                               # Source code for API Gateway
│   │   ├── main/java/com/storychime/apigateway/  # Java package for API Gateway
│   │   │   └── ApiGatewayApplication.java         # Main application class
│   │   └── application.properties         # Configuration for API Gateway
│   ├── pom.xml                            # Maven or Gradle file
│   └── README.md                          # Documentation for API Gateway
│
├── content-generation-service/            # Content Generation Service
│   ├── src/                               # Source code for Content Generation
│   │   ├── main/java/com/storychime/content/  # Java package for Content Generation
│   │   │   ├── controller/                # Controller classes
│   │   │   │   └── ContentController.java  # Handles content generation requests
│   │   │   ├── model/                     # Model classes
│   │   │   │   └── ContentRequest.java     # Represents a content generation request
│   │   │   └── service/                   # Service classes
│   │   │       └── ContentService.java    # Business logic for content generation
│   │   └── application.properties          # Configuration for Content Generation Service
│   ├── pom.xml                            # Maven or Gradle file
│   └── README.md                          # Documentation for Content Generation Service
│
├── video-assembly-service/                # Video Assembly Service
│   ├── src/                               # Source code for Video Assembly
│   │   ├── main/java/com/storychime/assembly/  # Java package for Video Assembly
│   │   │   ├── controller/                # Controller classes
│   │   │   │   └── VideoAssemblyController.java  # Handles video assembly requests
│   │   │   ├── model/                     # Model classes
│   │   │   │   └── VideoRequest.java      # Represents a video assembly request
│   │   │   └── service/                   # Service classes
│   │   │       └── VideoAssemblyService.java  # Business logic for video assembly
│   │   └── application.properties          # Configuration for Video Assembly Service
│   ├── pom.xml                            # Maven or Gradle file
│   └── README.md                          # Documentation for Video Assembly Service
│
├── storage-service/                        # Storage Service
│   ├── src/                               # Source code for Storage
│   │   ├── main/java/com/storychime/storage/  # Java package for Storage
│   │   │   ├── controller/                # Controller classes
│   │   │   │   └── StorageController.java  # Handles storage requests
│   │   │   ├── model/                     # Model classes
│   │   │   │   └── MediaUploadRequest.java  # Represents a media upload request
│   │   │   └── service/                   # Service classes
│   │   │       └── StorageService.java    # Business logic for media storage
│   │   └── application.properties          # Configuration for Storage Service
│   ├── pom.xml                            # Maven or Gradle file
│   └── README.md                          # Documentation for Storage Service
│
├── user-management-service/                # User Management Service
│   ├── src/                               # Source code for User Management
│   │   ├── main/java/com/storychime/user/  # Java package for User Management
│   │   │   ├── controller/                # Controller classes
│   │   │   │   └── UserController.java    # Handles user-related requests
│   │   │   ├── model/                     # Model classes
│   │   │   │   └── User.java               # Represents a user entity
│   │   │   └── service/                   # Service classes
│   │   │       └── UserService.java       # Business logic for user management
│   │   ├── application.properties          # Configuration for User Management Service
│   │   ├── pom.xml                        # Maven or Gradle file
│   │   └── README.md                      # Documentation for User Management Service
│
├── service-registry/                       # Service Registry (Eureka)
│   ├── src/                               # Source code for Service Registry
│   │   ├── main/java/com/storychime/registry/  # Java package for Service Registry
│   │   │   └── RegistryApplication.java    # Main application class for Service Registry
│   ├── pom.xml                            # Maven or Gradle file
│   └── application.properties              # Configuration for Service Registry
│
└── README.md                               # Overall project documentation (if applicable)
```

## Key Components
- **StoryChimeAPI**: The main backend project containing all microservices (API Gateway, Content Generation, Video Assembly, Storage, User Management, and Service Registry).
- **README.md**: Documentation files for each service, outlining usage, setup instructions, and other relevant information.

This structure helps maintain clarity and organization, making it easier for developers and contributors to navigate the project. If you have further questions or need adjustments, feel free to ask!
