package org.example.main.solid.InterfaceSegregationPrinciple.good

interface Shooter {
    fun shoot()
}

interface Swimmer {
    fun swim()
}

interface Talker {
    fun talk()
}

interface Dancer {
    fun dance()
}

class Troll : Shooter, Swimmer {

    override fun shoot() {
        TODO("Not yet implemented")
    }

    override fun swim() {
        TODO("Not yet implemented")
    }
}
