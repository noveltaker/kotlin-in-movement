package solid.SingleResponsibilityPrinciple.good

class Book {

    private var title: String? = ""

    private var author: String? = ""

    private var descrition = ""

    private var pages: Int = 0
}

class Persistence {

    fun saveBook() {
        // someone books ...
    }
}
