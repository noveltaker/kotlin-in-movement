package oop.itemabstract.solution

abstract class Characters(protected val name: String, protected var level: Int) {

    abstract fun attack()

    abstract fun run()

    abstract fun levelUp()
}
