package oop.itemabstract.solution

class Baton(name: String, level: Int) : Characters(name, level) {
    override fun attack() {
        println("발차기")
    }

    override fun run() {
        println("배트카 이동")
    }

    override fun levelUp() {
        this.level += 1
    }
}
