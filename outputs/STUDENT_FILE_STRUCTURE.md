# JPetStore Version 1 — Student-Friendly File Structure

This structure keeps files easy to find. It uses three simple frontend folders and the required Spring Boot backend folders.

```text
jpetstore-project/
│
├── backend/
│   ├── pom.xml                         Maven dependencies
│   └── src/main/
│       ├── java/com/example/jpetstore/
│       │   ├── JpetStoreApplication.java     Starts Spring Boot
│       │   ├── config/                       CORS and starter data
│       │   ├── controller/                   API classes
│       │   ├── dto/                          API response classes
│       │   ├── entity/                       Database table classes
│       │   ├── exception/                    Common error handling
│       │   ├── repository/                   Database access
│       │   └── service/                      Future business logic
│       └── resources/
│           └── application.properties        Database configuration
│
├── frontend/
│   └── src/app/
│       ├── app.module.ts                     Registers Angular components
│       ├── app-routing.module.ts             Enables routes
│       ├── app.routes.ts                     Lists application URLs
│       ├── app.component.ts/html             Main page layout
│       │
│       ├── core/                             Application-wide code
│       │   ├── api.config.ts                 Backend URL
│       │   ├── api.service.ts                Reusable API call
│       │   └── health.service.ts             Health API call
│       │
│       ├── shared/                           Reusable UI pieces
│       │   ├── header.component.ts/html
│       │   ├── loading.component.ts/html
│       │   ├── error-message.component.ts/html
│       │   └── placeholder.component.ts/html
│       │
│       └── features/                         Actual pages
│           └── home/
│               ├── home.component.ts
│               └── home.component.html
│
├── database/
│   └── jpetstore_setup.sql                   Simple MySQL script
│
└── outputs/                                  Explanation documents
```

## Easy way to remember the frontend folders

- `core`: things the whole application needs, such as API services.
- `shared`: small UI components reused by more than one page.
- `features`: pages that users open, such as the home page.

## Easy way to remember the backend folders

- `controller`: receives a request from Angular.
- `service`: contains application logic.
- `repository`: reads and writes MySQL data.
- `entity`: represents a MySQL table in Java.
- `dto`: sends simple response data to Angular.

## Mentor explanation

> “I arranged the project by responsibility. Angular has core services, reusable shared components, and feature pages. Spring Boot separates API controllers, services, repositories, and database entities. This keeps files small and makes it easy to know where a new file should be added.”
