package org.example.main.introduction

class Custom

class User(val email: String, val pwd: String)

data class Item(var name: String = "")

interface ICar {
    fun move()
    fun stop()
}

class BMW : ICar {

    constructor()

    override fun move() {
        println(">>>>>>>>>>> move")
    }

    override fun stop() {
        println(">>>>>>>>>>>> stop")
    }
}

fun main(args: Array<String>) {

    var custom: Custom

    var user: User = User("test@naver.com", "1234")
    println(user.email)

    var item: Item = Item()

    item.name = "teest-item"

    println(item.name)

    var bmw: BMW = BMW()

    bmw.move()
}
