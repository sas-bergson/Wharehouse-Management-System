# Phase 2 — Java SE Engineering

## Objective

Refactor Phase 1 into a layered, testable, persistent Java SE application.

## Learning outcomes

- Separation of concerns: `model` / `service` / `repository` / `ui`
- Interfaces and dependency injection by constructor
- Collections and the Streams API
- Checked vs unchecked exceptions; custom exception types
- File I/O (`java.nio.file`) and CSV or JSON persistence
- JUnit 5, assertions, test fixtures
- Logging with SLF4J instead of `System.out`

## Deliverables

1. Packages: `model`, `service`, `repository`, `ui`, `exception`.
2. `ProductRepository` **interface** with a `FileProductRepository` implementation.
3. Business rules moved into services: FIFO issuing, reorder thresholds, stock valuation.
4. Persistence to `data/products.csv` (or JSON) with load-on-start and save-on-exit.
5. Unit tests for the service layer (≥ 10 tests, happy path + edge cases).
6. SLF4J logging on all service methods.
7. `mvn clean verify` passes with all tests green.

## Acceptance criteria

- [ ] No UI class is imported by a service or repository
- [ ] `ProductRepository` is an interface; the UI depends on the interface only
- [ ] Restarting the app preserves stock levels
- [ ] Tests cover: receive, issue, over-issue rejection, low-stock, persistence round-trip
- [ ] Custom exception `InsufficientStockException` used correctly
- [ ] Zero `System.out.println` in `service` or `repository`

## Stretch goals

- Add a `Supplier` entity and supplier CRUD
- Export a stock valuation report to CSV
- Introduce an in-memory repository for tests (no file I/O in unit tests)

## How to submit

PR against `main`, Phase 2 box ticked, with a short note on the design decisions.
