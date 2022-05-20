package solid.LiskovSubstitutionPrinciple.bad


open class Rectangle constructor(private var width: Int, private var height: Int) {
    fun calculateArea(): Int = this.width * this.height
}


class Square constructor(private var width: Int, private var height: Int) : Rectangle(width, height) {

    private var _width = width

    private var _height = height

}
