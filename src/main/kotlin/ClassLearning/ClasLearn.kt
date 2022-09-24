package ClassLearning

import java.util.StringJoiner

class Car(whellCount: Int = 1, color: String = "Red") {
    private val mwhellCount: Int
    private val mcolor = color

    init {
        mwhellCount = whellCount
        "PRIMARY CONSTUCTOR CREATED".printLog()
        "WhellCount:$whellCount, Color:$color".printLog()
    }

    constructor(whellCount: Int, color: String = "Red", statu: String) : this(whellCount) {
        "1.secondary constructor created".printLog()
        "WhellCount:$whellCount, Color:$color, Status:$statu".printLog()
    }

    constructor(whellCount: Int, color: String = "Red", statu: String, age: Int) : this(1, "RED") {
        "2.secondary constructor created".printLog()
        "WhellCount:$whellCount, Color:$color, Status:$statu, Age:$age".printLog()
    }

}

fun main() {
//    val car0 = Car(4, "Red")
//    val car1 = Car(4, statu = "C")
    val car2 = Car(4,statu = "C", age = 3)



}

fun String.printLog() {
    println(this)
    println("---------------")

}