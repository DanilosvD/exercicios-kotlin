package operadores

fun main(){

  multiplicacao()
}

fun soma(){

    var valor1 = 4
    var valor2 = 6

    var resultadoExpressao = valor1 + valor2 // Com expressão

    var resultadoComando = valor1.plus(valor2) // Com comando

    valor1 += valor2 // Com atribuição

    println(resultadoExpressao)
    println(resultadoComando)
    println(valor1)

}

fun subtracao(){

    var valor1 = 4
    var valor2 = 6

    var resultadoExpressao = valor1 - valor2 // Com expressão

    var resultadoComando = valor1.minus(valor2) // Com comando

    valor1 -= valor2 // Com atribuição

    println(resultadoExpressao)
    println(resultadoComando)
    println(valor1)

}

fun multiplicacao() {

    var valor1 = 5
    var valor2 = 6

    var resultadoExpressao = valor1 * valor2 // Com expressão

    var resultadoComando = valor1.times(valor2) // Com comando

    valor1 *= valor2 // Com atribuição

    println(resultadoExpressao)
    println(resultadoComando)
    println(valor1)

}

fun  divisao(){

    var valor1 = 24
    var valor2 = 6

    var resultadoExpressao = valor1 / valor2 // Com expressão

    var resultadoComando = valor1.div(valor2) // Com comando

    valor1 /= valor2 // Com atribuição

    println(resultadoExpressao)
    println(resultadoComando)
    println(valor1)

}

fun restoDivisao(){

    var valor1 = 11
    var valor2 = 6

    //var resultadoExpressao = valor1 % valor2 // Com expressão

    //var resultadoComando = valor1.mod(valor2) // Com comando

    valor1 %= valor2 // Com atribuição

    println(valor1 % valor2)
    println(valor1.mod(valor2))
    println(valor1)

}