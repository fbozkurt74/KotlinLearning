package Functions

import java.util.InputMismatchException

fun main() {
    val number= takeCube(3)
    println(number)
}
fun takeCube(number:Int):Int{
    fun takeSquare(number: Int):Int{
        return number*number
    }
    //dsada
    return takeSquare(number)*number
}