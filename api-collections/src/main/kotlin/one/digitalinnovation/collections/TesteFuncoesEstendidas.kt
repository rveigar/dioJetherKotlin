package one.digitalinnovation.collections

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )

    println("--------somatoria--------------")
    println(salarios.somatoria())

    println("-----media-----------------")
    println(salarios.media())

    val myString:String = "Ola Mundo"
    val result = myString.removeFirstLastChar()
    println("resultado: $result")

    
    var numberList = listOf(1,2,3,4,5)
    var sum = numberList.reduce { count, number -> count + number }
    println("The sum of the numbers is: " + sum) //15

}

fun String.removeFirstLastChar(): String =  this.substring(1, this.length - 1)


