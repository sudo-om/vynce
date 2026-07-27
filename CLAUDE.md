# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Commands

### Building and Running
- Build the project: `./mvnw clean install`
- Run the application: `./mvnw spring-boot:run`
- Run tests: `./mvnw test`
- Run a specific test: `./mvnw -Dtest=ClassName test`

### Development
- The application uses Spring Boot 4.0.5 with Java 21
- Dependencies are managed via Maven
- Lombok is used for reducing boilerplate code
- MapStruct is used for object mapping

## Architecture Overview

### Project Structure
- `src/main/java/com/ompatil/projects/vynce`: Main application code
  - `controller`: REST API controllers (REST endpoints)
  - `dto`: Data Transfer Objects (request/response objects)
  - `entity`: JPA entities representing database tables
  - `repository`: Spring Data JPA repositories
  - `service`: Business logic services
  - `config`: Configuration classes
  - `security`: Security configuration and JWT authentication
  - `llm`: Utilities for LLM/Prompt handling

### Key Components

#### Entities (in `src/main/java/com/ompatil/projects/vynce/entity`)
- `User`: Represents application users
- `Project`: Represents projects users can create
- `ProjectMember`: Links users to projects with roles
- `Subscription`: Manages user subscription plans
- `ProjectFile`: Stores file metadata for projects
- `Preview`: Stores file previews/thumbnails
- `ChatSession`: Stores chat conversations with AI
- `ChatMessage`: Individual messages in chat sessions

#### Controllers (REST API)
- `AuthController`: Authentication endpoints (login, signup)
- `UserController`: User profile management
- `ProjectController`: Project CRUD operations
- `ProjectMemberController`: Managing project members and roles
- `FileController`: File upload/download operations
- `ChatController`: Streaming chat interface with AI
- `BillingController`: Subscription and payment handling
- `UsageController`: Tracking usage metrics

#### Services
- `UserService`: User management operations
- `ProjectService`: Project lifecycle management
- `ProjectFileService`: File storage operations (using MinIO)
- `ProjectMemberService`: Managing project collaborators
- `AiGenerationService`: AI chat streaming responses (using Spring AI)
- `SubscriptionService`: Subscription plan management
- `UsageService`: Tracking AI usage for billing
- `PaymentProcessor`: Stripe payment integration

#### Configuration
- `AiConfig`: Spring AI configuration for OpenAI integration
- `PaymentConfig`: Stripe payment configuration
- `StorageConfig`: MinIO object storage configuration
- `WebSecurityConfig`: Spring Security configuration with JWT
- `JwtAuthFilter`: JWT authentication filter
- `AuthUtil`: JWT token utilities
- `SecurityExpressions`: Custom SpEL expressions for security

#### Security
- JWT-based authentication
- Role-based access control (USER, ADMIN roles)
- Password encoding with BCrypt
- Stateless authentication using JWT tokens

### Key Technologies
- Spring Boot 4.0.5
- Spring Data JPA with Hibernate
- PostgreSQL database
- Spring Security with JWT
- Spring AI for OpenAI integration
- MinIO for object storage (file uploads)
- Stripe for payment processing
- MapStruct for DTO/entity mapping
- Lombok for reducing boilerplate
- Reactor for reactive streams (used in chat streaming)

### Database Schema Overview
- Users table: authentication and profile information
- Projects table: user-owned projects
- ProjectMembers table: many-to-many relationship between users and projects with roles
- Subscriptions table: user subscription plans
- ProjectFiles table: files uploaded to projects
- Previews table: generated file previews/thumbnails
- ChatSessions and ChatMessages: conversation history with AI assistant

### Development Notes
1. The application uses Java 21 (configured in pom.xml)
2. Lombok annotations reduce boilerplate (getters, setters, constructors)
3. MapStruct is used for clean DTO to Entity mapping
4. Spring Data JPA repositories provide CRUD operations
5. REST controllers return JSON responses
6. File uploads are stored in MinIO (S3-compatible storage)
7. Payments are processed through Stripe
8. AI chat functionality uses Spring AI with OpenAI models