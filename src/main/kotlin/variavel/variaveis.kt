package variavel

fun main() {
    vaar()
    vaal()

    println(MAX_AGE)
    println(MIN_AGE)


}
    fun vaar() {

        // Valores definidos na execução, se altera.

        var tipoImplicito = 22  // não nulo
        tipoImplicito = 3
        println(tipoImplicito)

        var tipoExplicito: Int? // nulo ou int.
        tipoExplicito = null
        println(tipoExplicito)

        var tipoExplicitoSemNull: Int // Não nulo. (?) permite o nulo.
        tipoExplicitoSemNull = 33
        println(tipoExplicitoSemNull)

    }

    fun vaal() {

        // Valores definidos na execução, não se altera.

        val tipoImplicitoInalterado = 22  // não nulo
        //   tipoImplicitoInalterado = 3
        println(tipoImplicitoInalterado)

        val tipoExplicitoInaltaerado: Int? // nulo ou int.
        tipoExplicitoInaltaerado = null
        println(tipoExplicitoInaltaerado)

        val tipoExplicitoSemNullInalterado: Int // Não nulo. (?) permite o nulo.
        // tipoExplicitoSemNullInalterado = null
        tipoExplicitoSemNullInalterado = 30
        println(tipoExplicitoSemNullInalterado)
    }

  // Valores definidos na compilação, não se alteram.

    const val MIN_AGE = 15

    const val MAX_AGE = 56

