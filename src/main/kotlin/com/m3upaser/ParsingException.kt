package com.m3upaser

class ParsingException : RuntimeException {
    val line: Int

    constructor(line: Int, message: String) : super("$message at line $line") {
        this.line = line
    }

    constructor(line: Int, message: String, cause: Exception) : super("$message at line $line", cause) {
        this.line = line
    }
}