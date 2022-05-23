package oop.encapsulation

class Item(private val content: String, private val name: String) {

    fun getItemName() = this.name

    fun getItemContent() = this.content
}
