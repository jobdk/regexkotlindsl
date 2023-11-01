# regexkotlindsl
## Domain-specific language for easier creation of regular expressions

The `regexkotlindsl` DSL (Domain-Specific Language) allows you to create complex regular expressions without the need for specific regex knowledge. This is especially useful for people who don't use regex on a daily basis.
### Example
 ```kotlin
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