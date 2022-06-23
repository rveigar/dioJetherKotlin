package one.digitalinnovation.Testes

enum class Months {
    January,
    February

}
enum class Months2(var shorthand: String) {
    January("JAN"),
    February("FEB")

}
fun main() {
    println(Months.January)
    println(Months.values().size)

    for (enum in Months.values()){
        println(" for ${enum.name}")
    }
    for (enum in Months2.values()){
        println(enum.shorthand)
    }
    Months.values().forEach{ println ("forEach $it ") }
    Months2.values().forEach{ println ("forEach Months2 ${it.name} ${it.shorthand} ") }

}