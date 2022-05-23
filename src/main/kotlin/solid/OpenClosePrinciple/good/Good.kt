package solid.OpenClosePrinciple.good

interface Shape {
    fun calculatorArea(): Int
}

class Rectangle(private var width: Int, private var height: Int) : Shape {

    fun getWidth() = this.width

    fun getHeight() = this.height

    override fun calculatorArea(): Int = width * height
}

class Circle(private var radius: Int) : Shape {

    fun getRadius() = this.radius

    override fun calculatorArea(): Int = (Math.PI * (this.radius * this.radius)).toInt()
}

class AreaCalculator {
    fun calculator(shape: Shape): Int = shape.calculatorArea()
}
