package ClassLearning

import Functions.takeSquare
import java.awt.Color
import java.util.StringJoiner

open class Shape(val name: String) {
    var mcolor: String = ""
    var mEdgeCount: Int = 0

    constructor(name: String, color: String) : this(name) {
        mcolor = color
    }

    constructor(name: String, color: String, edgeCount: Int) : this(name) {
        mcolor = color
        mEdgeCount = edgeCount
    }

    open fun drawShape() {
        println("Name:$name")
        println("Color:$mcolor")
        println("Color:$mEdgeCount")

    }

    fun calculateArea(): Int = if (mEdgeCount != 0) {
        mEdgeCount * mEdgeCount
    } else {
        0
    }
}

class Rectangle(name: String) : Shape(name) {
    override fun drawShape() {
        super.drawShape()
        calculateArea()
        val rectangle = """
            **********
            *        *   
            *        *   
            **********
            """.trimIndent()
        println(rectangle)
    }

}

class Circle(name: String, color: String) : Shape(name, color) {
    override fun drawShape() {
        super.drawShape()

        val circle = """
            *   *
         *         * 
        *     E     * 
        *     C     *  
         *    E    *
          *       * 
              *    
            """.trimIndent()
        println(circle)
    }

}
class Square(name: String,color: String,edgeCount: Int):Shape(name,color,edgeCount){
    override fun drawShape() {
        super.drawShape()
        val square="""
            *******        ******       *******
            *            *              *   
            *****        *              *****
            *            *              *
            *******        ******       *******
            """.trimIndent()
        println(square)
    }

}

fun main() {
    val shape = Shape("Shape")
    val rectangle = Rectangle("Rectangle")
    val circle = Circle("Circle", "Ece")
    val sqare = Square("Square", "Cyan", 4)

        shape.drawShape()
        rectangle.drawShape()
        circle.drawShape()
        sqare.drawShape()

}
