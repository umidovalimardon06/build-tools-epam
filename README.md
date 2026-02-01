# Maven Build Lifecycle

Apache Maven builds projects using **lifecycles**. A lifecycle is a sequence of phases that Maven runs in order.

---

## Main Build Lifecycles

Maven has **three standard lifecycles**:

1. **Default** – main lifecycle (builds the project)
2. **Clean** – cleans the project (removes `target/`)
3. **Site** – generates documentation and reports

---

## Default Lifecycle (Most Important)

The **default lifecycle** is responsible for building and publishing the project.

Main phases (in order):

```text
validate
compile
test
package
verify
install
deploy
```

### What these phases do (simple)

* **validate** – checks if the project is correct
* **compile** – compiles source code
* **test** – runs unit tests
* **package** – creates JAR/WAR/EAR
* **verify** – checks quality rules
* **install** – installs artifact to local repo (`.m2`)
* **deploy** – uploads artifact to remote repo

Running a later phase automatically runs all previous ones.

---

## Clean Lifecycle

Used to clean the project.

Main phase:

```text
clean
```

What it does:

* Deletes the `target/` directory

Example:

```bash
mvn clean
```

---

## Site Lifecycle

Used to generate documentation and reports.

Main phase:

```text
site
```

What it does:

* Generates HTML documentation
* Creates reports (tests, coverage, javadoc)

Output location:

```text
target/site/index.html
```

Example:

```bash
mvn site
```

---

## Plugins in Maven

Maven does the actual work using **plugins**.

### Core Plugins

Used for basic build operations:

* Compilation
* Installation
* Deployment
* Validation

Examples:

* `maven-compiler-plugin`
* `maven-install-plugin`
* `maven-deploy-plugin`

---

### Packaging Plugins

Used to create different types of artifacts:

* **jar** – Java libraries
* **war** – Web applications
* **ear** – Enterprise applications
* **shade** – Fat / Uber JARs

Examples:

* `maven-jar-plugin`
* `maven-war-plugin`
* `maven-shade-plugin`

---

## Quick Summary

* Maven has **3 lifecycles**: Default, Clean, Site
* **Default lifecycle** builds and publishes the project
* **Clean** removes build output
* **Site** generates documentation
* **Plugins** do the real work
* Later phases automatically run earlier ones
