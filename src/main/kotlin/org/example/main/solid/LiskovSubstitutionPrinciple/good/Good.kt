package org.example.main.solid.LiskovSubstitutionPrinciple.good

class Rectangle constructor(private var width: Int, private var height: Int) {

    fun calculateArea(): Int = this.width * this.height

    fun isSquare(): Boolean = this.width == this.height
}
