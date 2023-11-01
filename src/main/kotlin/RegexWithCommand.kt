package regexdsl

interface RegexWithCommand {
    infix fun with(next: String): RegexOrAndOccursCommands}


