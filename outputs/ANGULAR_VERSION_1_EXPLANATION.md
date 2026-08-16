# Angular Version 1 — Simple Explanation Guide

## What Angular does in this project

Angular creates the user interface that opens in the browser at `http://localhost:4200`.

Version 1 has only a home page, a header, basic navigation, and a small connection check to the Spring Boot backend.

## Simple Angular flow

```text
main.ts
  ↓
AppModule
  ↓
AppComponent
  ↓
Header + router-outlet
  ↓
HomeComponent
```

## Important files

| File | Simple explanation |
|---|---|
| `src/main.ts` | Starts the Angular application. |
| `src/app/app.module.ts` | Lists the components and Angular modules used by the application. |
| `src/app/app.component.ts` | The main application frame. |
| `src/app/app.component.html` | Shows the header and the place where pages appear. |
| `src/app/app-routing.module.ts` | Turns on routing. |
| `src/app/app.routes.ts` | Lists the URLs and which component each URL opens. |
| `src/app/shared/header.component.*` | Navigation bar shown on every page. |
| `src/app/features/home/home.component.*` | Home page with the five pet categories. |
| `src/app/core/api.service.ts` | Reusable code for calling Spring Boot. |
| `src/app/core/health.service.ts` | Calls the health endpoint only. |
| `src/app/shared` | Reusable loading, error, header, and future-feature messages. |

## How the home page works

When the user opens `/`:

1. Angular loads `HomeComponent`.
2. `HomeComponent` contains a simple list of five categories: Fish, Dogs, Cats, Reptiles, and Birds.
3. `*ngFor` repeats one category card for every category in the list.
4. Angular calls the backend health API through `HealthService`.
5. While waiting, `LoadingComponent` displays `Loading...`.
6. If the backend does not respond, `ErrorMessageComponent` displays a message.

## How the backend call works

```text
HomeComponent
  ↓
HealthService
  ↓
ApiService
  ↓
http://localhost:8080/api/health
```

`ApiService` keeps the API URL in one place. Future components can reuse it instead of writing the full URL again.

## Routes

| URL | Component | Version 1 status |
|---|---|---|
| `/` | `HomeComponent` | Implemented |
| `/catalog` | `PlaceholderComponent` | Future Version 2 |
| `/account` | `PlaceholderComponent` | Future Version 3 |
| `/cart` | `PlaceholderComponent` | Future Version 4 |
| `/orders` | `PlaceholderComponent` | Future Version 5 |

## Basic Angular words to explain

| Word | Meaning |
|---|---|
| Component | A small part of a web page, such as the header or home page. |
| HTML template | The `.html` file that describes what a component displays. |
| Service | A class used for shared work, such as calling an API. |
| Route | A URL path that opens a page. |
| `routerLink` | A link that changes the Angular page without refreshing the browser. |
| `*ngIf` | Shows something only when a condition is true. |
| `*ngFor` | Repeats HTML for every item in a list. |

## Simple mentor statement

> “I used the classic Angular module structure because it is simple to follow. `AppModule` registers the application components. `AppComponent` provides the common page layout. Routing selects the page. The home component displays five categories and uses a service to call the Spring Boot health API. I separated reusable loading and error messages so future pages can use them too.”
