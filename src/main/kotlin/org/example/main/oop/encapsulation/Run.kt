package org.example.main.oop.encapsulation

import org.example.main.oop.encapsulation.bad.Bad
import org.example.main.oop.encapsulation.good.Good

fun main() {
    val bad = Bad("test1")
    println(bad.name)

    val good = Good("test1")
    println(good.getName())
}
