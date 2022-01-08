package estrutura_repeticao

fun main(){
   step(4)
}

fun foor(){
    for(repete in 0..15) {
        print("$repete ")
    }
}

fun downTo(){
    // Repete de forma inversa
    for(repeteReverso in 15 downTo 0){
        print("$repeteReverso")
    }
}

fun until(){
    // Repete do início ao fim menos um
    for(totalMenosUm in 1 until 20){
        print("$totalMenosUm ")
    }
}

fun step(numero:Int){
    //Repete com intervalos. Precisa-se de um parâmetro inteiro.
    for(repeteComIntervalo in 0..20 step numero){
        print("$repeteComIntervalo ")
    }
}