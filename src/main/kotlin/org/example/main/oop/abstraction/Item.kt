package org.example.main.oop.abstraction

class Item(name: String, override var content: String) : AbstractItem(name) {
    override fun on() = this.getName()
}
