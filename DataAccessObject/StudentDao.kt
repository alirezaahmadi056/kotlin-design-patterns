
interface StudentDao {

    fun getAllStudents(): List<StudentModel>

    fun getStudent(id: Int): StudentModel

    fun updateStudent(studentModel: StudentModel)

    fun deleteStudent(studentModel: StudentModel)

}