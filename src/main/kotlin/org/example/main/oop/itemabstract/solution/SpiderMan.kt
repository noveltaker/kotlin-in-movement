package org.example.main.oop.itemabstract.solution

class SpiderMan(name: String, level: Int) : Characters(name, level) {

    override fun attack() {
        println("거미줄 공격")
    }

    override fun run() {
        println("도망")
    }

    override fun levelUp() {
        this.level += 1
    }
}
