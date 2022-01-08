package funcoes

import operadores.soma

fun main(){
  println(singleLine("Danilo","Vieira"))

  println(soma(5,7))
  println(nomeMes(8))
}

// Função com o retorno inferido ou retorno em linha
  private fun singleLine(nome:String, sobreNome: String) = "$nome $sobreNome"// retorno


  //Uma função com dois parâmetros e tipo de retorno.Int
  private fun soma(valor1: Int, valor2: Int): Int{
    return valor1 + valor2
  }

fun nomeMes(numeroMes: Int): String{
  val nomeMes =  when (numeroMes){
    1 -> "Janeiro"
    2 -> "Fevereiro"
    3 -> "Março"
    4 -> "Abril"
    5 -> "Maio"
    6 -> "Junho"
    7 -> "Julho"
    8 -> "Agosto"
    9 -> "Setembro"
    10 -> "Outubro"
    11-> "Novembro"
    12-> "Dezembro"
    else -> "Mes não existe"
  }
  return nomeMes
}