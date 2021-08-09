package base

fun cast(num: Any) {

    if (num is Int) {
        var i = num as Number
        println("Int case $i")
    }

    if (num is String) {
        println("String case sucess")
    }

}

fun main(args: Array<String>) {
    var n = 100
    cast(n)
    cast("test")
}
