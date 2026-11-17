# Phase 3 — GUI Programming

## Objective

Build a **Swing (or JavaFX) Operator Station** for warehouse floor staff, reusing
the Phase 2 service layer unchanged.

## Learning outcomes

- Event-driven programming
- Layout managers and component composition
- Model-View-Controller separation in a desktop app
- Table models, dialogs, form validation
- Long-running work off the Event Dispatch Thread

## Deliverables

1. A desktop window with at least three screens/panels:
   - **Receiving dock** — receive stock against a product
   - **Stock movement** — issue stock with quantity and reference
   - **Search & alerts** — searchable product table, low-stock highlighted
2. The GUI calls **only** the Phase 2 service layer — no SQL, no file I/O, no direct repository use.
3. Input validation in the UI; domain errors surfaced as dialogs.
4. `mvn exec:java` (or a documented `main`) launches the GUI.

## Acceptance criteria

- [ ] GUI is fully usable with the mouse and keyboard
- [ ] Receiving and issuing from the GUI updates persisted data (restart proves it)
- [ ] Low-stock products visually distinguished in the table
- [ ] No business logic in the GUI classes — they call services
- [ ] No unhandled exception can crash the window
- [ ] `mvn clean verify` still passes

## Note — this GUI is permanent

This application becomes the **desktop client** in Phases 5 and 6. Design it as
a real deliverable, not a throwaway demo.

## Stretch goals

- Keyboard shortcuts and a menu bar
- A simple bar chart of stock levels
- Printable stock report

## How to submit

PR against `main`, Phase 3 box ticked, with screenshots in the PR description.
