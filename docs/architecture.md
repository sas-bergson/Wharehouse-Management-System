# Architecture

Design decisions and diagrams for Online Warehouse. Update this file whenever a
structural decision changes — it is part of the deliverable.

## Evolution

| Phase | UI | Business logic | Persistence | Communication |
|---|---|---|---|---|
| 1 | Console | in `main` | in-memory collections | none |
| 2 | Console | `service` package | files (CSV/JSON) | none |
| 3 | Swing/JavaFX | `service` package | files | direct call |
| 4 | Swing/JavaFX | `service` package | JDBC + PostgreSQL | direct call |
| 5 | Swing + CLI | `service` package | JDBC + PostgreSQL | TCP sockets |
| 6 | Web + Swing | Spring services | JPA + PostgreSQL | HTTP/REST |

## Layering rule (Phase 2 onward)

```
UI  ──►  Service  ──►  Repository (interface)  ──►  Implementation
```

- The UI **never** touches a repository directly.
- The service **never** imports a UI class.
- Repository **interfaces** are frozen once written; only implementations swap.

## Domain model (draft)

- `Product` — id, sku, name, category, unitPrice, reorderThreshold
- `StockMovement` — id, productId, type (RECEIVE/ISSUE), quantity, timestamp, reference
- `Supplier` — id, name, contact, leadTimeDays
- `Order` — id, customer, lines, status, createdAt
- `User` — id, username, role (ADMIN/MANAGER/STAFF/CUSTOMER)

## ERD

<!-- Add the ERD image here in Phase 4, e.g. ![ERD](erd.png) -->

## Decision log

| Date | Decision | Rationale |
|---|---|---|
| | | |
