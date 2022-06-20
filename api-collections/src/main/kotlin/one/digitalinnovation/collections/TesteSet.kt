package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("-----------------")
    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("-----------------")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }

    val (a, b) = Pair(1, "x")
    println(a) // 1
    println(b) // x
    val p1 = Pair (2,2)
    val p2 = Pair (2,4)
    val p3 = Pair (3,3)
    var map = mapOf(p1,p2,p3)
    println(map)
}