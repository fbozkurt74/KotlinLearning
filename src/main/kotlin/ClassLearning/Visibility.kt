package ClassLearning

import java.util.StringJoiner

class BankAccount {

    var balance = 1_000_000
        get() {
            return field //backing field
        }
        private set(value) {
            field = value
        }

    fun userFunction() {
        balance
    }
}

open class Foo() {
    private val name = "Ferdi"                          //Sadece bu class içinde kullanabiliriz.
    public val surName = "Bozkurt"                      //Her Yerden erişebiliriz.
    internal val age = 24                               //Class ve modül içerisinde kullanabiliriz.
    protected val email = "ferdibozkurt@hotmail.com"      //Class içinde ve Miras alan kişiler sadece kullanabilsin.
    fun printName() {
        println(name)
        println(surName)
        println(age)
        println(email)
    }

    fun name(name: String): String {
        return name.printLog().toString()
    }

}

//Enkapsülation=Bir clasın üye değişkenlerini private'de tutup bu değişkenlere ulaşacak olan fonksiyonları publicte tutmaktır.
fun main() {
    val bankAccount = BankAccount()
    bankAccount.balance
    val foo = Foo()
    foo.printName()


}
