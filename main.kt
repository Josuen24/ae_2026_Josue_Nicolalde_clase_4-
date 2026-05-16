data class Student(
    val id: Long,
    val name: String,
    val email: String,
    val grade: Int,
    val isActive: Boolean
)

fun getStudents(): List<Student> {

    val jorge = Student(
        id = 1,
        name = "Jorge",
        email = "jorge@puce.edu.ec",
        grade = 8,
        isActive = true
    )

    val ana = Student(
        id = 2,
        name = "Ana",
        email = "ana@puce.edu.ec",
        grade = 6,
        isActive = true
    )

    val juan = Student(
        id = 3,
        name = "Juan",
        email = "juan@puce.edu.ec",
        grade = 9,
        isActive = true
    )

    return listOf(jorge, ana, juan)
}

fun getResult(grade: Int): String {
    return if (grade > 7) {
        "Aprobado"
    } else {
        "Reprobado"
    }
}

fun main() {

    val estudiantesEstudiosos = mutableListOf<Student>()

    for (student in getStudents()) {

        if (student.grade > 7) {
            estudiantesEstudiosos.add(student)
        }

        println("${student.name}: ${getResult(student.grade)}")
    }

    println("Estudiantes estudiosos:")
    val estudiantesEstudiosos2: List<Student> = getStudents().filter { loQueSea ->
    	loQueSea > 7
    }
    println(estudiantesEstudiosos2)

    for (student in estudiantesEstudiosos) {
        println(student)
    }
}