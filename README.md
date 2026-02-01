# Apache Maven – Basics

Apache Maven is mainly used for:

1. Build tool
2. Dependency management
3. Unit testing
4. Documentation
5. Reporting

**Single touch point:** `pom.xml`

---

## POM (Project Object Model)

The POM is the central configuration file in Maven.

### groupId

* Usually represents the **company or organization name**
* Written in **reverse domain format**

Example:

```text
com.company.project
```

---

## Main sections of a POM

1. **Project information**
   `groupId`, `artifactId`, `version`
2. **Properties**
   Reusable values (Java version, encoding, etc.)
3. **Dependencies**
   Libraries required by the project
4. **Build**
   How the project is built
5. **Reporting**
   Reports and documentation
6. **Repositories**
   Where dependencies/plugins are downloaded from
7. **Profiles**
   Environment-specific configuration

---

## Build Section

The `<build>` section defines the **project’s build behavior**.

### What it controls

1. Which plugins are executed
2. Where source and output files are located
3. Custom build behavior (often via profiles)

### Common tags

```xml
<build>
    <directory />
    <outputDirectory />
    <testOutputDirectory />
    <sourceDirectory />
    <testSourceDirectory />
    <resources />
    <testResources />
    <plugins>
        <plugin />
    </plugins>
</build>
```

Most build logic is implemented using **Maven plugins**.

---

## Reporting Section

The `<reporting>` section is used to generate **HTML reports**.

### Key points

* Works **only** with the `site` lifecycle
* No default `<reporting>` section (unlike `<build>`)
* Generates a UI entry point: `index.html`

Run with:

```bash
mvn -U clean site
```

(`-U` forces Maven to re-check remote repositories)

### Common use cases

1. Code coverage
2. Test reports
3. Static code analysis
4. API documentation

Reports are generated under:

```text
target/site/
```

---

## Reactors, Parents, Archetypes

### Parent

* Used for **shared settings**
* Centralizes versions, plugins, properties

### Reactor

* Used for **building multiple projects at once**
* Defined using `<modules>`
* One Maven command builds all modules together

### Archetype

* Used as a **project template**
* Helps generate a standard project structure

---

## Quick Summary

* **Parent** → shared configuration
* **Reactor** → multi-module build
* **Archetype** → project template
* **Build** → how the project is built
* **Reporting** → HTML reports via `mvn site`
