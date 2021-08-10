package base

enum class COLOR {
    RED, ORANGE, YELLO
}

enum class COLOR2(var r: Int, var g: Int, var b: Int) {
    RED(255, 0, 0), ORANGE(255, 165, 0), YELLOW(255, 255, 0),
    BLUE(0, 0, 255), VIOLET(238, 130, 238);
    fun rgb() = (r * 256 + g) * 256 + b
}


fun main(args: Array<String>) {
    println(COLOR2.BLUE.rgb())
}
