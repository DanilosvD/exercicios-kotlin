package erros_variaveis

fun main(){

   // var erroAtribuicao

    var atribuicaoImplicita = 22
    println(atribuicaoImplicita)

    var atribuicaoExplicita:Int
    atribuicaoExplicita = 34
    println(atribuicaoExplicita)

    var anoNovo = "Feliz 2022!"
    //anoNovo = 2022
    anoNovo = 2022.toString() // convertendo
    println(anoNovo)

}