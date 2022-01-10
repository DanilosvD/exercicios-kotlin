package lista

fun main(){
    lista()
}

fun lista(){

    // listOf é imutável, ou seja, não pode ser alterada
    val nome = listOf("Danilo","Bruno","Diego","Rodrigo")
    // Mutável
    val nomes = mutableListOf("Danilo","Bruno","Diego","Rodrigo")

    // Pegar
    val posicao = nomes.get(3)
    val primeiro = nomes.first()
    val ultimo = nomes.last()
    val posicaoAleatoria = nomes.random()
    nomes.get(3)

    nomes.add("Bruna")
    nomes.add("Carla")
    nomes.remove("Rodrigo")
    nomes.removeAt(0)

    println(nomes)
    println(primeiro)
    println(posicao)
    println(ultimo)
    println(posicaoAleatoria)
    println(nomes.contains("Carla"))
    println(nomes.sorted())// Ordem alfabética
}