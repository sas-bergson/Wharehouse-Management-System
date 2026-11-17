# 🏭 Online Warehouse

> A six-phase Java capstone: build **one** warehouse management system that evolves
> from a console app → Java SE → Swing GUI → JDBC database → socket networking →
> REST/cloud. Public and open for student forks, branches, and pull requests.

[![Java](https://img.shields.io/badge/Java-17%2B-orange?logo=openjdk)](https://adoptium.net/)
[![Maven](https://img.shields.io/badge/Build-Maven-blue?logo=apachemaven)](https://maven.apache.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](CONTRIBUTING.md)
[![Capstone](https://img.shields.io/badge/capstone-six--phase%20learning%20path-blue)]()

---

## 📖 About the Project

**Online Warehouse** is the capstone project for the Java Programming course. It is
built in **six evolutionary phases**. The business domain never changes; the
engineering grows. Each phase is a **git tag** and a **GitHub Milestone**, so you can
fork the repository at whatever phase your cohort is currently on.

The system manages products, stock movements, suppliers, orders, and users across
one or more warehouse terminals — first on a single machine, eventually over a
network and then over the web.

---

## 🎓 Six-Phase Learning Path

| Phase | Tag | Focus | Key deliverable |
|:---:|---|---|---|
| **1** | `phase-1-console` | Console programming | Menu-driven CLI: receive stock, issue stock, list products, low-stock report |
| **2** | `phase-2-se` | Java SE engineering | Layered architecture (`model`/`service`/`repository`), collections, streams, exceptions, file persistence, JUnit, Maven, logging |
| **3** | `phase-3-gui` | GUI programming | Swing/JavaFX **Operator Station**: receiving dock, stock movement form, search table, low-stock alerts |
| **4** | `phase-4-db` | Database programming | JDBC + PostgreSQL: DAO pattern, connection pooling, transactions, append-only stock movement ledger |
| **5** | `phase-5-network` | Network programming | Multi-threaded TCP socket server + multiple terminals, JSON line protocol, central sync |
| **6** | `phase-6-web-cloud` | Web / Cloud | Spring Boot REST API, web dashboard, role-based auth, Docker, GitHub Actions, live cloud deployment |

### What carries forward (this is the point of the project)

- **Domain model** (`Product`, `StockMovement`, `Supplier`, `Order`, `User`) — survives all six phases.
- **Service layer** — written in Phase 2, called by GUI in Phase 3, moved server-side in Phase 5, wrapped by controllers in Phase 6.
- **Repository *interface*** — the signature never changes; the implementation swaps:
  `FileProductRepository` (P2) → `JdbcProductRepository` (P4) → `RestProductRepository` (P6, in the client).
- **The Swing GUI is never thrown away.** In Phase 6 it becomes the *desktop client* of the
  final system, repointed from the socket server to the REST API. Warehouse-floor
  operator stations are thick clients in real WMS software.

### Architecture evolution

```
Phase 1   Console ────────────────────────────────► in-memory collections

Phase 2   Console ──► Service ──► Repository(iface) ──► File storage
                                   └── implemented by FileRepository

Phase 3   Swing GUI ──► Service ──► Repository(iface) ──► File storage

Phase 4   Swing GUI ──► Service ──► Repository(iface) ──► JDBC ──► PostgreSQL

Phase 5   Swing GUI ─┐
          CLI ───────┴─► TCP Socket Server ──► Service ──► Repository ──► PostgreSQL
                         (multi-threaded)

Phase 6   Browser ──┐
          Swing GUI ┴─► REST API (Spring Boot) ──► Service ──► Repository ──► PostgreSQL
                                                                    └── Docker + Cloud
```

---

## 🛠️ Tech Stack by Phase

| Phase | Libraries / Tools |
|---|---|
| 1–2 | Java 17, `java.util`, `java.io`, `java.nio`, Maven, JUnit 5, SLF4J |
| 3 | Java Swing (or JavaFX) — no external UI dependencies required |
| 4 | JDBC, PostgreSQL 14+, HikariCP, Flyway (or Liquibase), Testcontainers |
| 5 | `java.net` (`ServerSocket`/`Socket`), `java.util.concurrent`, Jackson (JSON) |
| 6 | Spring Boot 3 (Web, Data JPA, Security), Thymeleaf or React, OpenAPI/Swagger, Docker, GitHub Actions |

---

## 📁 Repository Structure

```
online-warehouse/
├── .github/
│   ├── workflows/
│   │   └── ci.yml                      # Build + test on every push/PR
│   ├── ISSUE_TEMPLATE/
│   │   ├── bug_report.md
│   │   ├── feature_request.md
│   │   └── config.yml
│   └── PULL_REQUEST_TEMPLATE.md
├── docs/
│   ├── phase-1-console/README.md       # Phase brief + rubric
│   ├── phase-2-se/README.md
│   ├── phase-3-gui/README.md
│   ├── phase-4-db/README.md
│   ├── phase-5-network/README.md
│   ├── phase-6-web-cloud/README.md
│   └── architecture.md                 # Diagrams, ERD, design decisions
├── src/
│   ├── main/java/com/onlinewarehouse/
│   │   └── OnlineWarehouseApp.java     # Phase 1 entry point
│   └── test/java/com/onlinewarehouse/
│       └── SmokeTest.java
├── .gitignore
├── CODE_OF_CONDUCT.md
├── CONTRIBUTING.md
├── LICENSE
├── README.md
└── pom.xml
```

As the course progresses, students add packages such as `model/`, `service/`,
`repository/`, `ui/`, `net/`, `web/` — see each phase brief in `docs/`.

---

## 🚀 Getting Started

### Prerequisites

- [JDK 17+](https://adoptium.net/)
- [Maven 3.8+](https://maven.apache.org/) (or use the included `mvnw` wrapper once added)
- [Git](https://git-scm.com/)
- An IDE: [IntelliJ IDEA](https://www.jetbrains.com/idea/), [Eclipse](https://eclipseide.org/), or [VS Code](https://code.visualstudio.com/)
- PostgreSQL 14+ *(from Phase 4 onward only)*

### 1. Fork, then clone your fork

```bash
# Fork on GitHub first, then:
git clone https://github.com/<your-username>/online-warehouse.git
cd online-warehouse
git remote add upstream https://github.com/<org-or-owner>/online-warehouse.git
```

### 2. Choose your phase

`main` always reflects the **current phase of the cohort**. If you are joining late
or need to restart a phase, check out the matching tag:

```bash
git tag                       # list all phase tags
git checkout phase-2-se       # start from the Phase 2 snapshot
git switch -c feature/my-work # branch from there
```

### 3. Build and run

```bash
mvn clean verify              # compile + run all tests
mvn exec:java                 # run the Phase 1 console app
```

Later phases add their own run instructions to the matching phase brief in `docs/`.

---

## 🤝 Contributing

Read **[CONTRIBUTING.md](CONTRIBUTING.md)** for the full workflow. Short version:

```bash
git switch -c feature/inventory-alerts      # branch from main
# ...make changes, add tests...
git commit -m "feat(inventory): add low-stock alert service"
git push origin feature/inventory-alerts
# open a Pull Request against main
```

**Rules of collaboration**

- ✅ `main` is protected — never push directly to it.
- ✅ Every PR links an issue (`Closes #42`) and requires **1 approval** + green CI.
- ✅ New features ship with tests and updated docs.
- ✅ Conventional Commits only (`feat`, `fix`, `docs`, `test`, `refactor`, `chore`, `perf`).
- ❌ No secrets, credentials, `.env` files, or IDE folders (`.idea/`, `.vscode/`).

Branch prefixes: `feature/`, `bugfix/`, `hotfix/`, `docs/`, `test/`, `refactor/`.

---

## 🗺️ Roadmap

- [x] Repository scaffolding, CI, templates
- [ ] **Phase 1** — Console CLI
- [ ] **Phase 2** — Layered Java SE + file persistence + tests
- [ ] **Phase 3** — Swing/JavaFX Operator Station
- [ ] **Phase 4** — JDBC + PostgreSQL + movement ledger
- [ ] **Phase 5** — Multi-threaded socket server
- [ ] **Phase 6** — REST API + web dashboard + Docker + cloud deploy
- [ ] Final report, demo video, presentation

---

## 👥 Team & Contact

- **Course:** Java Programming — Final Year Capstone
- **Institution:** _[Your University Name]_
- **Instructor:** _[Instructor Name]_

**Maintainers**

| Role | Student | GitHub |
|---|---|---|
| Team Lead | _[Name]_ | [@student1](https://github.com/student1) |
| Backend | _[Name]_ | [@student2](https://github.com/student2) |
| Frontend / GUI | _[Name]_ | [@student3](https://github.com/student3) |
| QA & Docs | _[Name]_ | [@student4](https://github.com/student4) |

Questions? Open a [Discussion](../../discussions) or an issue.

---

## 📜 License

Released under the **MIT License**. See [LICENSE](LICENSE).

---

## 🙏 Acknowledgments

Course instructors and mentors, the open-source Java & Spring communities, and every
student who forked this repo and contributed.
