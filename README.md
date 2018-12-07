# neo-devpack-java #

Java artifact for developing smart contracts in Java. Artifact has no other 3th party dependencies.

## Usage ##

In your maven pom.xml add dependency.

```xml
<dependency>
    <groupId>org.neo</groupId>
    <artifactId>neo-devpack-java</artifactId>
    <version>2.3.0</version>
</dependency>
```
You can use any building system. See please [maven.org](https://search.maven.org/artifact/org.neo/neo-devpack-java/2.3.0/jar).

## pom.xml example ##

Whole pom.xml example.

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>org.neo.example</groupId>
    <artifactId>hello-world-smart-contract</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>My first smart contract</name>

    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.neo</groupId>
            <artifactId>neo-devpack-java</artifactId>
            <version>2.3.0</version>
        </dependency>
    </dependencies>
</project>
```

## Smart contract examples ##

For more Java smart contract examples please take a look at [examples-java](https://github.com/neo-project/examples-java).