# SpringBootMastery_BanqueMisr

This project demonstrates the core concepts of Dependency Injection (DI) using plain Java, Spring Core, and Spring Boot.

---

## 🔧 Project Structure & Tasks

### 1. DIY IoC/DI (Plain Java)
- Created `Printer` and `UserService` classes.
- Demonstrated constructor-based and setter-based injection.
- No Spring involved — just Java wiring.

### 2. Spring Core Introduction
- Added Spring Core dependency to a Maven project.
- Annotated components with `@Component`.
- Used `AnnotationConfigApplicationContext` to retrieve beans.

### 3. Spring Boot Setup
- Bootstrapped project using Spring Initializr.
- Created a simple REST controller (`GreetingController`) with a "Hello, Spring Boot!" endpoint.

### 4. Understanding `@SpringBootApplication`
- Demonstrated how to exclude `DataSourceAutoConfiguration`.
- Confirmed that no H2 DB starts when excluded.

### 5. Profiles & Configuration Binding
- Used `application.properties` and `application-dev.yml`.
- Bound configuration using `@ConfigurationProperties("app")`.
- Exposed `/title` endpoint to return configured title.

### 6. Qualified Dependency Injection
- Created interface `TimeService` with two implementations:
  - `SystemTimeService` (marked `@Primary`)
  - `MockTimeService` (annotated with `@Qualifier("mock")`)
- Injected into a `TimeController`.

---

## 🖼️ Screenshots & Notes

Check `docs/annotations.md` for:
- Sample output screenshots
- Console logs
- Controller outputs
- Configuration files

---

## 📦 Tech Stack

- **Java 17+**
- **Spring Core**
- **Spring Boot**
- **Maven**

