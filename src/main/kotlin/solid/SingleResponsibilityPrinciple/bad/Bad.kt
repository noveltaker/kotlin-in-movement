package solid.SingleResponsibilityPrinciple.bad

class Book {

    private var title: String? = ""

    private var author: String? = ""

    private var descrition = ""

    private var pages: Int = 0

    fun saveBook() {
        // someone books ...
    }
}
