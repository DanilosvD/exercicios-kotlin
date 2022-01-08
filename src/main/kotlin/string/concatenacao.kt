package string

fun main(){
    concatenando()
}

fun concatenando(){

    val desejo = "Feliz "
    val ano = "2022"

    // Formas de concatenar
    println(desejo + ano)
    println("$desejo $ano")
    println("${desejo.capitalize()} ${ano.lowercase()}")
}