
class PrototypePatternDemo {

    init {

        val eId = 12345
        val eName = "Alireza Ahmadi"
        val eDesignation = "software engineer"
        val eSalary = 1.0
        val eAddress = "Tehran Iran ..."
        val e1 = EmployeeRecord(eId, eName, eDesignation, eSalary, eAddress)
        e1.showRecord()
        val e2 = e1.clone as EmployeeRecord
        e2.showRecord()

    }

}