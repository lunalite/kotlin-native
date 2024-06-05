package org.example

fun String.countDistinctCharacters() = lowercase().toList().distinct().count()

fun runCommon() {
    println("Hello, enter your name!")
    val name = readln()

    name.replace(" ", "").let {
        println("Hello $name, your name contains ${it.length} letters")

        println("Your name contains ${it.countDistinctCharacters()} unique characters")
    }
}
