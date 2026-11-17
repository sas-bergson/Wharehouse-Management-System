# Phase 4 — Database Programming

## Objective

Replace file persistence with **PostgreSQL over JDBC**, using the DAO pattern and
transactions, with an append-only stock movement ledger.

## Learning outcomes

- JDBC: `Connection`, `PreparedStatement`, `ResultSet`
- Connection pooling with HikariCP
- DAO pattern behind the existing repository interfaces
- Transactions and rollback on failure
- Schema versioning with Flyway (or Liquibase)
- Integration testing with Testcontainers

## Deliverables

1. PostgreSQL schema: `products`, `suppliers`, `stock_movements`, `users`.
2. `JdbcProductRepository` implementing the Phase 2 interface — **no interface changes**.
3. `stock_movements` is **append-only**; current quantity is derived or maintained transactionally.
4. Flyway (or Liquibase) migration scripts under `src/main/resources/db/migration/`.
5. Connection pool configured via HikariCP; credentials via environment variables.
6. Integration tests using Testcontainers against a real PostgreSQL instance.

## Acceptance criteria

- [ ] App runs against PostgreSQL with file persistence removed
- [ ] Receiving/issuing writes to `stock_movements` **and** updates product quantity in one transaction
- [ ] A forced failure mid-transaction leaves the database unchanged
- [ ] All SQL uses `PreparedStatement` — no string concatenation
- [ ] No credentials committed; `.env.example` documents required variables
- [ ] `mvn clean verify` passes including integration tests

## Stretch goals

- Add an `orders` and `order_lines` table
- A reporting query returning stock valuation per supplier
- Indexes on `stock_movements(product_id, created_at)`

## How to submit

PR against `main`, Phase 4 box ticked, with the migration scripts and a note on
the transaction boundary you chose.
