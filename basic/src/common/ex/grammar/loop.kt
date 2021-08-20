package base

/*
do while 문법
 */
fun main(args: Array<String>) {
    toDoWhile()
//    toWhile()
//    toFor()
}

fun toDoWhile() {
    println("do while")
    var i = 0

    do {
        println(i)
        i++
    } while (i < 10)
}

fun toWhile() {

    var i = 0

    while (i < 10) {
        println(i)
        i++
    }

}

fun toFor() {

    println(">>>>>>>>>>>>>>>>>>>> 1")
    for (i: Int in 1..10) {
        println(i)
    }

    var end = 10

    println(">>>>>>>>>>>>>>>>>>>> 2")
    for (i: Int in 1..end) println(i)

    println(">>>>>>>>>>>>>>>>>>>> 3")
    for (i : Int in 1 until end) println(i)

}
