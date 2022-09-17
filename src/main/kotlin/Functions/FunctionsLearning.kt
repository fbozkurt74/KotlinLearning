package Functions

import java.util.InputMismatchException
import java.util.StringJoiner

fun main() {
    val number= takeCube(3)
    val car= cars("BMW","bissan")
    getUserInfo("Ferdi","Bozkurt","25","", key = 4)
}
fun takeCube(number:Int):Int{
    fun takeSquare(number: Int):Int{
        return number*number
    }
    println(number)

    //dsada
    return takeSquare(number)*number
}
fun cars(car:String,bike:String):String{
    println("$car,$bike")
    return car+bike
}
fun getUserInfo(vararg userInfo:String,key:Int){
    userInfo[3]
    userInfo.get(3)
}
