package metodo_comparacao

fun main(){
 emptyBlank()
}

 fun emptyBlank(){

  val vazia = ""
  val branco = "    "

  // Verifica o tamanho
  println(vazia.length)
  println(branco.length)


  // Verifica se está em branco ou vazia
  println(vazia.isEmpty())
  println(vazia.isBlank())
  println(vazia.isNullOrBlank() && vazia.isNullOrEmpty())

  println(branco.isEmpty())
  println(branco.isNullOrEmpty() && branco.isNullOrBlank()) // Está em branco, mas não vazia
 }