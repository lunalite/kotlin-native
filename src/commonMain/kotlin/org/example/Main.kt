package org.example

fun runCommon() {
    println("Hello, enter your name!")
    val name = readln()

    name.replace(" ", "").let {
        println("Hello $name, your name contains ${it.length} letters")
    }
}
