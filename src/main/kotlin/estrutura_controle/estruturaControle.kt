package estrutura_controle

fun main(){
   whenn()
}

fun ifElse(){

    // var idade:Int
    val idade = 71
    val hora = 17.1

  /*  if(idade < 18){
        print("Menor de idade!")
    } else {
        print("Maior de idade!")
    }

    if(idade in 16..70){
        print("Pode Votar")
    }else{
        print("Não pode votar")
    }*/

   /* if(hora in 7f..12f){
        println("Bom dia")
    }else if(hora in 12f..17f){
        println("Boa tarde")
    }else{
        println("Boa noite")
    }*/

    val valor1 = 5
    val valor2 = 7
    var maior = 0

       /* if (valor2 > valor1){
            maior = valor2
         }else{
             maior = valor1
        }*/
     // Forma simplificada de representar o valor a cima
    // Retorna um valor
    maior = if(valor2 > valor1) valor2 else valor1
    print(maior)
}

fun whenn(){

    val numero = 0

    // Quando
    when {
        // Caso
        // {} usada caso utilize mais de um método no bloco
        numero > 0 -> println("Número positivo")
        numero < 0 -> println("Número negativo")
        else -> println("Zero")
    }

    val mes = 13

    when (mes){
        1 -> println("Janeiro")
        2 -> println("Fevereiro")
        3 -> println("Março")
        4 -> println("Abril")
        5 -> println("Maio")
        6 -> println("Junho")
        7 -> println("Julho")
        8 -> println("Agosto")
        9 -> println("Setembro")
        10 -> println("Outubro")
        11-> println("Novembro")
        12-> println("Dezembro")
        else -> println("Mes não existe")
    }

    // Retornando valores
    val mesAno = 4
  val nomeMes =  when (mesAno){
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
    println(nomeMes)

    // Formas de comparar com If/when

    // Forma if
    val nome = "Verde"
    if(nome.equals("Vermelho") || nome.equals("Verde") || nome.equals("Branco")){
        println("Cor válida")
    }else{
        print("Cor inválida")
    }

    // Forma when
    val cor = "Branco"
    when(cor){
        "Vermelha", "Verde", "Azul" -> println("Cor válida")
       else -> print("Cor inválida")
    }
}