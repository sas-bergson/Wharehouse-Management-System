# Phase 1 — Console Programming

## Objective

Build a menu-driven console application that manages warehouse stock in memory.

## Learning outcomes

- Console I/O with `Scanner` and formatted output
- Control flow: loops, `switch`, validation
- Arrays and `ArrayList`, basic class design
- Input validation and graceful error handling

## Deliverables

1. A main menu with: **Receive stock**, **Issue stock**, **List products**, **Low-stock report**, **Exit**.
2. A `Product` class with at least: id, name, quantity, reorder threshold.
3. All data held in in-memory collections (no files, no DB yet).
4. Invalid input (non-numeric quantity, unknown product) handled without crashing.
5. `mvn clean verify` passes.

## Acceptance criteria

- [ ] `mvn exec:java` runs the app and the menu loops until Exit
- [ ] Receiving stock increases quantity; issuing decreases it
- [ ] Issuing more than available is rejected with a clear message
- [ ] Low-stock report lists products at or below threshold
- [ ] No `System.out.println` outside the UI layer *if* a UI layer exists yet
- [ ] Code compiles with zero warnings on `mvn clean verify`

## Stretch goals

- Sort the product list by name or quantity
- Colour the low-stock rows with ANSI escapes
- Add a "search product by name" option

## How to submit

Push your branch and open a PR against `main` using the PR template. Tick the
**Phase 1** box.
