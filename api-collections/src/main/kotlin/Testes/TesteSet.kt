fun main() {

    data class tipoFuncionarios(
        val nome: String,
        val salario: Double,
        val tipoContratacao: String
    )

    val tipo1 = tipoFuncionarios("Glenda", 1000.0, "PJ")
    val tipo2 = tipoFuncionarios("Joana", 2000.0, "PJ")
    val tipo3 = tipoFuncionarios("Clara", 3000.0, "PF")
    val tipo4 = tipoFuncionarios("Mariana", 1500.0, "PF")

    val funcionarios1 = setOf(tipo1, tipo2)
    val funcionarios2 = setOf(tipo3, tipo4)
    val funcionarios3 = setOf(tipo2)

    var todosFuncionarios = funcionarios1.union(funcionarios2)
    println("-------union-------------")
    todosFuncionarios.forEach{println(it)}
    println("--------subtract------------")

    todosFuncionarios = funcionarios1.subtract(funcionarios3)
    todosFuncionarios.forEach{println(it)}
    println("--------intersect------------")
    todosFuncionarios = funcionarios1.intersect(funcionarios3)
    todosFuncionarios.forEach{println(it)}

}