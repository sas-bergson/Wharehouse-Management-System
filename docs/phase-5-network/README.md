# Phase 5 — Network Programming

## Objective

Turn the system into a **multi-terminal** warehouse: one central server, several
clients (GUI and/or CLI) talking to it over TCP.

## Learning outcomes

- TCP sockets: `ServerSocket`, `Socket`, streams
- A line-delimited JSON protocol
- Multi-threading: one thread per client, thread-safe state
- Graceful disconnects and error propagation
- Separating protocol from business logic

## Deliverables

1. A **WarehouseServer** that listens on a configurable port and serves multiple clients concurrently.
2. A defined text protocol (one JSON object per line) with request/response messages.
3. The Swing GUI and/or CLI act as **clients** — they no longer touch the database directly.
4. The server owns the service layer and database access.
5. A protocol document in this folder (`protocol.md`) listing every request and response.

## Acceptance criteria

- [ ] Two clients connected simultaneously can each receive and issue stock
- [ ] A stock change made by one client is visible to the other after refresh
- [ ] Disconnecting one client does not affect the others
- [ ] Malformed client messages are rejected without crashing the server
- [ ] Shared state is thread-safe (no lost updates under concurrent issue)
- [ ] `mvn clean verify` passes

## Stretch goals

- Broadcast stock-change notifications to all connected clients
- Server-side authentication per client connection
- Simple load test with 10 concurrent clients

## How to submit

PR against `main`, Phase 5 box ticked, with `protocol.md` included.
