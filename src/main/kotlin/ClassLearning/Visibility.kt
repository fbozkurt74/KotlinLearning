package ClassLearning

class BankAccount {

    var balance = 1_000_000
        get() {
            return field //backing field
        }
         private set(value) {
            field = value
        }
    fun userFunction(){
        balance
    }
}

fun main() {
    val bankAccount=BankAccount()
    bankAccount.balance


}
