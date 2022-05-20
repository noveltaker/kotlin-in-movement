package solid.OpenClosePrinciple.bad

class Rectangle(private var width: Int, private var height: Int) {
    fun getWidth() = this.width
    fun getHeight() = this.height
}

class Circle(private var radius: Int) {
    fun getRadius() = this.radius
}

class AreaCalculator {
    fun calculatorRectangleArea(rectangle: Rectangle): Int = rectangle.getWidth() * rectangle.getHeight()

    fun calculatorCircle(circle: Circle) = Math.PI * (circle.getRadius() * circle.getRadius())
}
