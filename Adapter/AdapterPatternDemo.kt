
import android.util.Log

class AdapterPatternDemo {

    init {

        val targetInterface = BankCustomer()
        targetInterface.generateBankDetails()
        Log.i("TEST", targetInterface.creditCard)

    }

}