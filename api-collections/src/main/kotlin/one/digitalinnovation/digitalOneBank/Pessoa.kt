package one.digitalinnovation.digitalOneBank

class Pessoa constructor(var idade:Int=33){
    var nome:String = "Veiga"
        private set

    var cpf:String="548.577.897-74"

    inner class Endereco {
        var logradouro:String = "Avenida Paulista"
    }
    fun trocaNome(novoNome:String) {
        nome = novoNome
    }

}

fun main() {
    val veiga = Pessoa()
    //veiga.nome= "roberto"
    veiga.trocaNome("Vivian")
    println (veiga.nome)
    println (veiga.cpf)
    println (veiga.Endereco().logradouro)
    println (veiga.idade)
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