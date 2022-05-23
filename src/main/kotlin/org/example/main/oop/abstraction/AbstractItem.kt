package org.example.main.oop.abstraction

abstract class AbstractItem constructor(private val name: String) {

    abstract var content: String

    abstract fun on(): String

    fun getName() = this.name

    fun off() {
        println("off")
    }
}
