package one.digitalinnovation.Testes

//class ArrayString {
//}
fun main () {
    val nomes = Array<String>(3) {""}
    val n = Array(3){""}
    nomes[0]="Ze"
    nomes[1]="Pedro"
    nomes[2]= "Bia"
    println ("-------------------")
    for (nome in nomes){
        println (nome)

    }
    n[0]="Walter"
    n[1]="Gui"
    n[2]= "Lucas"
    println ("-------------------")

    for (i in n) {
        println (i)
    }


    nomes.sort()
    println ("-------------------")

    nomes.forEach { println(it) }

    nomes.sortDescending()
    println ("-------------------")
    nomes.forEach{ valor -> println (valor)}

    var marcas = arrayOf("Renault", "Ford", "Fiat")
    println ("-------------------")
    marcas.forEach{ valor -> println (valor)}

    marcas[0] = "Peugeot"
    marcas.sort()
    println ("-------------------")

    for (i in marcas){
        println(i)
    }
}
