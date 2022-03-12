package oop.encapsulation

fun main(args: Array<String>) {
    val item = Item("컨텐츠" , "아이템")
    println(item.getItemName())
    println(item.getItemContent())
}
