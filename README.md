# Maven Dependency Scope & Transitive Dependencies

## Dependency Scope

**Dependency scope** defines the *availability* of a dependency in different phases of a Maven build:

* Compile time
* Runtime
* Test time
* Whether it is included in the final artifact (JAR/WAR)

---

## 1. Compile Scope (default)

**Availability:**

* Compile time ✅
* Runtime ✅
* Test time ✅
* Included in final artifact (JAR/WAR) ✅

**Other characteristics:**

* Transitive ✅ (passed to downstream projects)

**Use case:**

* Core libraries your application needs to run

**Example:**

```xml
<dependency>
  <groupId>org.apache.commons</groupId>
  <artifactId>commons-lang3</artifactId>
  <version>3.14.0</version>
</dependency>
```

---

## 2. Provided Scope

**Availability:**

* Compile time ✅
* Runtime ❌ (provided by container)
* Test time ✅
* Included in final artifact ❌

**Other characteristics:**

* Transitive ❌

**Use case:**

* Dependencies supplied by the runtime environment (e.g., application server)

**Example:**

```xml
<dependency>
  <groupId>jakarta.servlet</groupId>
  <artifactId>jakarta.servlet-api</artifactId>
  <scope>provided</scope>
</dependency>
```

---

## Scope Comparison Table

| Scope    | Compile | Runtime | Test | Included in Artifact | Transitive |
| -------- | ------- | ------- | ---- | -------------------- | ---------- |
| compile  | ✅       | ✅       | ✅    | ✅                    | ✅          |
| provided | ✅       | ❌       | ✅    | ❌                    | ❌          |

---

## Transitive Dependencies

**Definition:**
Transitive dependencies are *dependencies of your dependencies* that Maven automatically includes.

---

## Spring Boot Example

If your project depends on:

```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

You indirectly get (transitively):

* Spring MVC
* Jackson (JSON processing)
* Embedded Tomcat
* Logging libraries
* Validation APIs

You declare **one dependency**, but Maven resolves and adds **many transitive dependencies**.

---

## Why Transitive Dependencies Matter

**Advantages:**

* Less manual dependency management
* Consistent versions
* Faster development

**Risks:**

* Dependency bloat
* Version conflicts ("jar hell")

---

## Useful Command

View full dependency hierarchy:

```bash
mvn dependency:tree
```

---

## Exam-Friendly Summary

* **Dependency scope** controls *when* and *how* a dependency is available
* **Compile** = everywhere + packaged
* **Provided** = compile/test only, container supplies at runtime
* **Transitive dependencies** are automatically pulled in dependencies of dependencies
