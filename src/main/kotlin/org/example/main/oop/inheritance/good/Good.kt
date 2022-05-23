package org.example.main.oop.inheritance.good

class Good(private var name: String) : Saveer {

    override fun save(name: String) {
        this.name = name
    }
}
