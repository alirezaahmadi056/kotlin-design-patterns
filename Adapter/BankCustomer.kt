
class BankCustomer : BankDetails(), CreditCard {

    override fun generateBankDetails() {

        accHolderName = "CodeGate"
        accNumber = 1234567
        bankName = "CG "

    }

    override val creditCard: String =
        "The Account number $accNumber of $accHolderName in $bankName bank is valid and authenticated for issuing the credit card. "
}