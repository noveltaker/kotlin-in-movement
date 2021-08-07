package base

class Person(val str: String)


fun main(args: Array<String>) {
    val person = Person("Test...")
    println(person.str)
}
