package one.digitalinnovation.digitalOneBank

class Pessoa {
    var nome:String = "Veiga"
    var cpf:String="548.577.897-74"
}

fun main() {
    val veiga = Pessoa()
    println (veiga.nome)
    println (veiga.cpf)
    val z:Float
    z=calculate(30.0f,10.0f,::divisao)
    println("z= $z")
}
fun soma(s1:Float, s2:Float) = s1.plus(s2)
fun subtracao(s1:Float, s2:Float) = s1.minus(s2)
fun multiplicacao(s1:Float, s2:Float) = s1*s2
fun divisao(s1:Float, s2:Float) = s1/s2

fun calculate(f1:Float, f2:Float, funcao:(Float,Float)->Float):Float {
    val result = funcao(f1,f2)
    return result
}