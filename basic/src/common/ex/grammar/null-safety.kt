package common.ex.grammar

fun describeString(maybeString: String?): String {              // 1
    if (maybeString != null && maybeString.length > 0) {        // 2
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"                           // 3
    }
}

fun strLength(notNull: String): Int {                   // 7
    return notNull.length
}

fun main(args: Array<String>) {


    var neverNull: String = "This can't be null"            // 1

//    neverNull = null                                        // 2

    var nullable: String? = "You can keep a null here"      // 3

    nullable = null                                         // 4

    var inferredNonNull = "The compiler assumes non-null"   // 5

//    inferredNonNull = null                                  // 6
//
    strLength(neverNull)                                    // 8
//    strLength(nullable)                                     // 9

}
