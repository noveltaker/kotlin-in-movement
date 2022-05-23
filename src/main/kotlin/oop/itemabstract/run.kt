package oop.itemabstract

import oop.itemabstract.solution.Baton
import oop.itemabstract.solution.SpiderMan

fun main(args: Array<String>) {

    val baton = Baton("크리스찬베일", 100)

    val spiderMan = SpiderMan("톰홀랜드", 10)

    baton.attack()

    spiderMan.attack()
}
