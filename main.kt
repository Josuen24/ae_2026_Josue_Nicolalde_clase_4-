fun main() {
    val grade: Int = 85 
    
    if (grade > 70){
        println("aprobado")
    } else {
        println("reprobado")
    }
    
    val result: String = if (grade > 70) {
        "Aprobado"
    } else {
        "Reprobado"
    }
	println(result)

    }