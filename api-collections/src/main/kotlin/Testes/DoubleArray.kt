fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.00
    salarios[1] = 500.00
    salarios[2] = 200.00
    println("----------------")
    salarios.forEach { println(it) }
    println("----------------")

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    val precos = doubleArrayOf(3550.0, 1235.00, 854.00)
    println("----------------")

    precos.sort()
    precos.forEach { println(it) }

    println("preco maximo = ${precos.maxOrNull()}")
    println("media dos precos ${precos.average()}")
    println("preco minimo = ${precos.minOrNull()}")

    val preco1200 = precos.filter { it > 900.0 }
    println("----------------")

    println(precos.filter { it > 900.0 })
    println("----------------")

    preco1200.forEach { println(it) }
    println("-----count-----------")

    println(precos.count { it in 800.0..1500.0 })

    println("-------find---------")
    println(precos.find { it == 1235.0 })
    println("----find2------------")

    println(precos.find { it == 900.0 })
    println("-------any ---------")
    println(precos.any { it > 500.0 })
    println("------any2----------")
    println(precos.any { it == 500.0 })


    data class funcionarios(
        val nome: String,
        val salario: Double
    ) {
        override fun toString(): String =
            """
            nome:    $nome,
            salario: $salario
            """.trimIndent()

    }

    val func1 = funcionarios("Glenda", 1000.0)
    val func2 = funcionarios("Joana", 2000.0)
    val func3 = funcionarios("Clara", 3000.0)

    val funcionariosAll = listOf(func1, func2, func3)
    println("------funcionarios Data Class----------")

    funcionariosAll.forEach { println(it) }
    println("------Joana----------")

    println(funcionariosAll.find { it.nome == "Joana" })

    println("------sortedBy ascending default----------")
    funcionariosAll
        .sortedBy { it.salario }
        .forEach { println(it) }
    println("------sortedBy descending----------")

    funcionariosAll.sortedByDescending { it.salario }.forEach { println(it) }


    data class tipoFuncionarios(
        val nome: String,
        val salario: Double,
        val tipoContratacao: String
    )
    //
    //   override fun toString():String =
    //       """
    //       nome:    $nome,
    //       salario: $salario,
    //       tipo:    $tipoContratacao
    //       """.trimIndent()
    //


    val tipo1 = tipoFuncionarios("Glenda", 1000.0, "PJ")
    val tipo2 = tipoFuncionarios("Joana", 2000.0, "PJ")
    val tipo3 = tipoFuncionarios("Clara", 3000.0, "PF")
    val tipo4 = tipoFuncionarios("Mariana", 1500.0, "PF")

    val tipoFuncionariosAll = listOf(tipo1, tipo2, tipo3, tipo4)
    println("------groupBy ----------")

    tipoFuncionariosAll
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }
    println("------groupBy uma linha ----------")

    tipoFuncionariosAll.groupBy { it.tipoContratacao }.forEach { println(it) }

}