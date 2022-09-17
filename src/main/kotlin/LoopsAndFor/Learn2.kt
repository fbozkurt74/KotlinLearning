package LoopsAndFor

fun main() {

    /**
     * 3 FARLI SEKILDE FOR YAZILABILIR
     * VALUE in list                         şeklinde value değerlerini alabiliriz
     * index in list.indices                 şeklinde index değerlerini alabiliriz
     * (index, value) in list.withIndex()    şeklinde index,value değerlerini alabiliriz.
     */
//     var number=0
//    while (number<5){
//        print("${number++}, ")
//    }
//        val countryCodeArray= arrayOf("tr","fr","az","en")
//
//        for (value in countryCodeArray){
//            print("$value ")
//        }
//
//        for (index in countryCodeArray.indices){
//            println("\n$index .value= ${countryCodeArray[index]}")
//        }
//        println("--------------------------------------------")
//        for ((index ,value) in countryCodeArray.withIndex()){
//            print("$index degeri :$value")
//        }
//        countryCodeArray.withIndex().forEach{iterable ->
//            iterable.index
//            iterable.value
//        }
//        repeat(10){
//            println("I go home")
//        }
//        for (value in 1..50){
//            if (value%2==0){
////                continue
//                break
//            }
//            print("\n$value")
//        }


//PİRAMİT YILDIZ
//    for (value in 1..10) {
//            println()
//        for (value2 in value..10) {
//            print(" ")
//        }
//            for (value3 in 1..value) {
//                print("*")
//                print(" ")
//            }
//
//    }
   returnLabel@ for (value in 1..5){
        for (value2 in value..5){
            if (value2%5==0){
                break@returnLabel
            }
            println("break2: $value2 | ")
        }
    }
}