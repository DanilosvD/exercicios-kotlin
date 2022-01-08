package operadores

fun main(){
    doarSangue()
}

fun pingo(){
    val bingo = listOf(8,9,2,89,13)
    val numero = (1..34).random() // gera um número aleatório

    println(numero)
    println(numero in bingo) // in verifica se contém

}

const val IDADE_MAX = 68
const val IDADE_MIN = 16

fun doarSangue(){
     var idade = (10..100).random() // gera uma idade aleatória
     println(idade)
     println(idade in IDADE_MIN..IDADE_MAX ) // Faixa range. Verifica se o número está dentro de uma faixa de valores
     println(idade >= IDADE_MIN && idade <= IDADE_MAX)
}