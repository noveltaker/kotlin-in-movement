package base

class Item {
    lateinit var title: String
    var count: Int
        get() = this.count
        set(value) {
            this.count = value
        }
}

/*
lateinit => auto set & get
get & set 로 작성 시 loop error 발생 ...
 */
fun main(args: Array<String>) {

    var item = Item()

    item.title = "test.."

    println(item.title)

    item.count = 11
}
