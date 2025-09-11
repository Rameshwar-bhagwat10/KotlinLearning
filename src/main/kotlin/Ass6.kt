// Parent class
open class BankAccount(
    public val accountHolder: String,  // public by default
    internal val bankName: String      // iBankAccountnternal modifier
) {
    private var balance: Double = 0.0   // private variable

    fun deposit(amount: Double) {
        balance += amount
        println("Deposited ₹$amount. Current balance updated.")
    }

    fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
            println("Withdrew ₹$amount. Current balance updated.")
        } else {
            println("Insufficient funds!")
        }
    }

    // Protected function → accessible only in subclass
    protected fun showBalance(): Double {
        return balance
    }
}

// Subclass
class SavingsAccount(accountHolder: String, bankName: String)
    : BankAccount(accountHolder, bankName) {

    fun displayBalance() {
        println("Account Holder: $accountHolder")
        println("Bank Name: $bankName")
        println("Balance: ₹${showBalance()}") // accessing protected function
    }
}

// Main function
fun main() {
    val myAccount = SavingsAccount("Rameshwar Bhagwat", "SBI Bank")

    myAccount.deposit(5000.0)
    myAccount.withdraw(1200.0)

    myAccount.displayBalance()  // Accessing balance via subclass
}
