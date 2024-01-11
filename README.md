# regexkotlindsl
## Domain-specific language for easier creation of regular expressions

The regexkotlindsl allows you to create complex regular expressions without the need for specific regex knowledge. This is especially useful for people who don't use regex on a daily basis.
### Example
 ```kotlin
    import regexdsl.build

    val regex = build regex {
        starts with something
        followed with "@"
        followed with something
        followed with "."
        ends with "com" or "de" or "net"
    }

    // THEN
    assertEquals(
        "^(.+)(@)(.+)(\\.)(com|de|net)\$",
        regex.pattern
    )
```
Further examples can be found in the test file: [RegexBuilderTest.kt](src/test/kotlin/RegexBuilderTest.kt)

### Concepts
In the following the key concepts of the regexkotlindsl are described.

| Concept                  | DSL                                                                                                                                   |
|--------------------------|---------------------------------------------------------------------------------------------------------------------------------------|
| Start                    | ```starts with```                                                                                                                     |
| Sequence                 | ```followed with```<br/>```followed with```                                                                                           |
| End                      | ```ends with```                                                                                                                       |
| Term                     | ```starts with "A"```                                                                                                                 |
| Iteration                | ```starts with "A"```<br/>```followed with "B"``` <br/>```followed with "C"``` <br/>```ends with "D"```                               |
| Encapsulation            | ```starts with inner regex(followed with "A" followed with "B" or "C") or "A"```                                                      |
| Constants                | ```starts with anything```<br/>```followed with something``` <br/>```followed with letters``` <br/>```ends with numbers```                                     |
| Alternatives             | ```starts with "A" or "B" ```                                                                                                                          |
| Quantification           | ```starts with "A" occurs 1..2```                                                                                                                          |
| Zero to infinite symbols | ```starts with "3" occurs indefinitely```                                                                                                                          |

**Explore the power of regexkotlindsl and simplify your regular expression creation.**

### Installation
#### Maven
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.jobdk</groupId>
        <artifactId>regexkotlindsl</artifactId>
        <version>v1.0.0</version> <!--Use current version-->
    </dependency>
</dependencies>
```

#### Gradle
```groovy
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}

dependencies {
    implementation 'com.github.jobdk:regexkotlindsl:v1.0.0' //Use current version
}
```

