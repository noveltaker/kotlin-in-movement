package introduction

fun main(args: Array<String>) {
    printStr()
    printStr("test ...")
    printPrevStr()
    var sum = sum(1, 5)
    println(sum)
    var multiple = multiple(10, 6)
    println(multiple)

    println(6 times "test")

    println("test1" auto "test2")
}

/**
 * 함수 선언
 */
fun printStr() {
    println(">>>>>>>>>>>>> success")
}

/**
 * function + 인자
 */
fun printStr(str: String) {
    println(str)
}

fun printPrevStr(prevStr: String = "win!") {
    println(prevStr)
}

fun sum(i: Int, j: Int): Int {
    return i + j
}

fun multiple(i: Int, j: Int) = i * j

infix fun Int.times(str: String) = str.repeat(this)

infix fun String.auto(str: String) = String.format("%s_%s", str, this)

