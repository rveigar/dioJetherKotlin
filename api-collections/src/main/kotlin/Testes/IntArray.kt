package Testes

class IntArray {
}

fun main() {

    var numeros = IntArray(3)
    numeros[0] = 1
    numeros[1] = 2
    numeros[2] = 3
    for (n in numeros) {
        println(n)
    }
    numeros.forEach{println(it)}
    numeros.forEach{ valor -> println(valor)}

    for (index in numeros.indices)
    {
        println("index "+numeros[index])
    }
    //
    // numeros.sort()
    for (valor in numeros)
    {
        println("valor "+valor)
    }

    val nums = intArrayOf(1,5,3,9,6)
    nums.forEach {  println(it) }

    nums.sort()
    nums.forEach {  println(it) }
}