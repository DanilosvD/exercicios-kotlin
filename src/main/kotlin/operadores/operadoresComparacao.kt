package operadores

 fun main(){
     maiorMenor()
     maiorMenorIgual()
     igual()
     diferente()
 }


fun maiorMenor(){

    val a = 4
    val b = 3

    // Retorna valor booleano tru/ false
    println(a > b)
    println(a < b)

    // Retorna valor inteiro 1 para (tru), -1 para (false), 0 para (igual)
    println(a.compareTo(b))
    println(b.compareTo(a))

}

fun  maiorMenorIgual(){

    val c = 7
    val d = 2

    println(c >= d)
    println(c <= d)

    println(c.compareTo(d) )
    println(d.compareTo(c))

}

fun igual(){

    val e = 4
    val f = 6

    println(e == f)

    println(e.equals(f))
}

fun diferente(){

    val g = 44
    val h = 3

    println(g != h)

    println(!(g.equals(h)))
}