package ClassLearning

/**
 * Interface'lerin Abstract classlardan en büyük farkı State tutuamıyor olmalarıdır.
 * Interface içerisindeki intial degeri olmayan bir property(field) yada body'si olmayan bir fonksiyon
 * Abstract olarak da tanımlanabilir.
 * interfaceleri anlamı geregi final yapamazsiniz. open yazilmasi da gereksizdir.(redundant)
 * classlar miras alınır interface ler iplement edilir.
 * Interface ler tahtıravalli gibidir. bir yerden tetiklendiğinde diğer taraftan etki (Ben çalıştım) salır.
 *  Abstract yapmamız default olarak zorunludur(yürüyebilmek konusabilmek,), interfaceler ise yeteneklerle geliştirilir.(Yüzme,Ingilizce konusmak,araba surmek)
 */
interface MyInterface {
    val prop: Int //abstract
    val propertyWithImplementation: String
        get() = "Foo" //Bu şekilde tanımlandığında state tutuyor gibi gorunuyor fakat biz geri donus degerı sabıt olan bır fonksiyon yazdık.

    fun foo() {
        print(prop)
    }

    fun foo2()
    abstract fun bar()

}


interface Named {
    val fullName: String?
}

interface Person : Named {
    val firstName: String
    val lastName: String
    override val fullName: String?
        get() = "$firstName $lastName"
}

class Employee1 : Person {
    override val firstName: String
        get() = TODO("Not yet implemented")
    override val lastName: String
        get() = TODO("Not yet implemented")
}

class Child(override val prop: Int = 29) : MyInterface {
    //override edilmesi zorunlu değildi.
    override val propertyWithImplementation: String
        get() = super.propertyWithImplementation

    override fun foo2() {
        TODO("Not yet implemented")
    }

    override fun bar() {
        TODO("Not yet implemented")
    }
}

interface A {
    fun foo() {
        print("")
    }

    fun bar()
}

interface B {
    fun foo() {
        print("B")
    }

    fun bar() {
        print("Bar")
    }
}

class C : A {
    override fun bar() {
        print("Bar")
    }
}

open class E() {
    //abstract fun asdasd()
}

class D : E(), A, B {
    override fun foo() {
        super<B>.foo()
        super<A>.foo()
    }

    override fun bar() {
        //super<A>.bar() A interface'inin body'si yok dolayısıyla super ile erişilemez.
        super<B>.foo()
        super.bar()

    }
}
