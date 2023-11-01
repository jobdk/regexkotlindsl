package regexdsl
interface RegexOrCommand {
    infix fun or(next: String): RegexOrAndOccursCommands}