# Contributing to Online Warehouse

Thanks for helping build Online Warehouse. This guide keeps contributions smooth,
fair, and gradeable.

## Who can contribute

Any student enrolled in the Java Programming capstone, or anyone with an
approved issue. Every contribution is credited in the phase report.

## Workflow

1. **Fork** the repository (or create a branch if you are a member).
2. **Branch from `main`** using a prefix:
   `feature/…`, `bugfix/…`, `hotfix/…`, `docs/…`, `test/…`, `refactor/…`
3. **Commit** using Conventional Commits (below).
4. **Push** and open a **Pull Request against `main`**.
5. **Link the issue** with `Closes #N` in the PR description.
6. **Address review feedback** — at least one approval is required.
7. A maintainer merges once CI is green.

> Never push directly to `main`. It is protected.

## Commit message format

```
<type>(<scope>): <short imperative description>
```

Types: `feat`, `fix`, `docs`, `test`, `refactor`, `style`, `chore`, `perf`

Examples:

```
feat(inventory): add low-stock alert service
fix(auth): handle null password on login
docs(readme): update phase 3 setup steps
test(order): add unit tests for order service
```

## Code style

- Java 17+. Follow [Google Java Style](https://google.github.io/styleguide/javaguide.html).
- No `System.out.println` in production code — use SLF4J.
- Public classes and methods require Javadoc.
- Prefer small methods (≤ 30 lines) and small classes.
- No magic numbers or strings — use constants or enums.

## Testing

- Every new feature or endpoint ships with tests.
- Run `mvn clean verify` locally before pushing.
- Target ≥ 70% coverage on new code.

## Pull request checklist

- [ ] Linked to an issue (`Closes #N`)
- [ ] Tests added or updated
- [ ] Docs updated (README / phase brief / Javadoc / Swagger)
- [ ] `mvn clean verify` passes locally
- [ ] No secrets, credentials, or IDE files committed

## Phase-specific rules

Each phase has a brief in `docs/phase-N-*/README.md` stating the learning
outcomes, deliverables, and acceptance criteria. **Read it before you code.**
Work that belongs to a later phase may be asked to move.

## Reporting bugs

Use the **Bug report** issue template. Include reproduction steps, expected vs
actual behaviour, logs, and your environment (OS, JDK version, phase tag).

## Suggesting features

Use the **Feature request** template. Describe the problem, the proposed
solution, and alternatives considered.

## Code of Conduct

By participating you agree to [CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md).
