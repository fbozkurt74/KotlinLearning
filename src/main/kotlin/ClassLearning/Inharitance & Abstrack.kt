package ClassLearning

/**
 * final ve open modifier'ları kullanmak anlamsız ve yanlıştır.
 * abstract olarak yazılmış class'a yeni eklenen tüm abstract yapılar, tüm child classlarda override edilmek zorundadır.
 * eğer abstract class'ınıza eklemek istediğiniz opsiyonel yapılar varsa, bunları chill classların tamamında override etmek zorundadır. Eger
 * etmek istemiyorsak open keyword'u ile tanımlayabiliriz.
 * abstract bir class, abstrack bir class'ı miras alırsa, abstract yapıları override etmek zorunda değildir.
 * abstrack fun body'si olmaz. proporty'lerinde default degeri olmaz
 * abstract classlar aynı zamanda instance'i oluşturulamayan classlardır. bu nedenle Singleton pattern'ler kullanabiliyorlar.
 */

abstract class MCDonalds{
    abstract val fridge: Fridge
    abstract val superVisor:SuperVisor
    abstract val employeeOne:Employee
    abstract val employeeTwo:Employee
    abstract val employeeThree:Employee
    abstract val menuList:List<Mchamburger>

    abstract fun  clean(clock:Int)

//opsiyonel
    open val policeOfficer:Police= Police()

}
abstract class McDonaldsExpress:MCDonalds(){
    abstract fun sellCoffee():McCoffee
    override fun clean(clock: Int){
        println("Clean time $clock")
    }

    override val fridge: Fridge
        get() = TODO("Not yet implemented")
}
class McDonaldsMaltepe:MCDonalds(){
    override val fridge: Fridge
        get() = TODO("Not yet implemented")
    override val superVisor: SuperVisor
        get() = TODO("Not yet implemented")
    override val employeeOne: Employee
        get() = TODO("Not yet implemented")
    override val employeeTwo: Employee
        get() = TODO("Not yet implemented")
    override val employeeThree: Employee
        get() = TODO("Not yet implemented")
    override val menuList: List<Mchamburger>
        get() = TODO("Not yet implemented")

    override fun clean(clock: Int) {
        TODO("Not yet implemented")
    }

}


class McCoffee {

}



class Mchamburger {

}

class Employee {

}

class Police {

}



class SuperVisor {

}



class Fridge(){

}