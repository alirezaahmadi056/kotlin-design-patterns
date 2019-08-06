
class StudentDaoImpl : StudentDao {

    private val students = arrayListOf(
        StudentModel(1, "name1", "family1"),
        StudentModel(2, "name2", "family2")
    )

    override fun getAllStudents(): List<StudentModel> = students

    override fun getStudent(id: Int): StudentModel = students[id]

    override fun updateStudent(studentModel: StudentModel) { students[studentModel.id] = studentModel }

    override fun deleteStudent(studentModel: StudentModel) { students.remove(studentModel) }

}