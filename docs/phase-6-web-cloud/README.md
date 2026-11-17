# Phase 6 — Web / Cloud Programming

## Objective

Expose the system over **HTTP as a REST API**, add a web dashboard, secure it with
role-based access, and deploy it to the cloud.

## Learning outcomes

- REST resource design and HTTP semantics
- Spring Boot: Web, Data JPA, Security
- DTOs, validation, global exception handling
- Authentication and role-based authorization
- OpenAPI documentation
- Docker, CI/CD, and cloud deployment

## Deliverables

1. Spring Boot REST API exposing products, stock movements, suppliers, orders, users.
2. Web dashboard (Thymeleaf **or** React) for managers: stock overview, low-stock list, movement history.
3. Role-based access: `ADMIN`, `MANAGER`, `STAFF` with different permissions.
4. OpenAPI/Swagger UI at `/swagger-ui.html`.
5. `Dockerfile` + `docker-compose.yml` (app + PostgreSQL).
6. GitHub Actions deploying to a cloud host (Render / Railway / Fly.io / AWS).
7. A live URL and demo credentials in this file.

## Acceptance criteria

- [ ] All CRUD endpoints documented in Swagger and covered by integration tests
- [ ] Unauthenticated requests receive `401`; unauthorized roles receive `403`
- [ ] `docker compose up` runs the whole stack locally
- [ ] CI builds, tests, and deploys on merge to `main`
- [ ] The application is reachable at a public URL with a seeded demo dataset
- [ ] The Swing Operator Station still works, now pointed at the REST API

## Stretch goals

- Refresh tokens
- Email alerts for low stock
- A public read-only stock API for partner systems

## How to submit

PR against `main`, Phase 6 box ticked, with the live URL and a 3-minute demo video link.
