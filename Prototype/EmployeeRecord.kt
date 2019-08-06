
import android.util.Log

class EmployeeRecord(
    private val id: Int,
    private val name: String,
    private val designation: String,
    private val salary: Double,
    private val address: String
) : Prototype {

    override val clone: Prototype =
        EmployeeRecord(id, name, designation, salary, address)

    init {

        Log.i("TEST", "   Employee Records of CodeGate Corporation ")
        Log.i("TEST", "---------------------------------------------")
        Log.i("TEST", "Eid \t eName \t EDesignation \t eSalary \t \t eAddress")

    }

    fun showRecord() {

        Log.i("TEST", "$id \t $name \t $designation \t $salary \t $address")

    }

}