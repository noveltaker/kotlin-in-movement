package common.ex.grammar

fun main(args: Array<String>) {
    try {
        println(">>>>>>>>>>>>>> try")
        throw NullPointerException()
    }catch (e : Exception){
        e.printStackTrace()
    }finally {
        println(">>>>>>>>>>>>>>> finally")
    }
}

