data class Student(
	val id: Long,
    val name: String,
    val email: String,
    val grade: Int,
    val isActive: Boolean
)
fun getStidents(): List<Student>{
    val Jorge = Student(
        name = "Jorge",
        email = "jorge@puce.edu.ec",
        grade = 8,
        id = 1,
        isActive = true
   ) 
    val Ana = Student(
        name = "Ana",
        email = "jorge@puce.edu.ec",
        grade = 8,
        id = 1,
        isActive = true
   ) 
    val Juan = Student(
        name = "Juan",
        email = "jorge@puce.edu.ec",
        grade = 8,
        id = 1,
        isActive = true
   ) 
    return listOf(Jorge, Ana, Juan)
}
fun getResult(grade: Int): String {
    return if  (grade>7){
        "Aprobado"
    } else {
        "Reprobado"
    }
}

fun main(){
    for (Studentt in getStudent()){
        println("${student.name} esta ${getResult{student.grade}}")
    }
}

fun main() {
	val Jorge = Student(
        name = "Jorge",
        email = "jorge@puce.edu.ec",
        grade = 8,
        id = 1,
        isActive = true
   ) 
    if(Jorge.grade > 7){
        println("Aprobado")
    } else {
        println("reprobado")
    }
    println(Jorge)
}