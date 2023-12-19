package List1

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    println("Classe do medicamento:")
    var classe = sc.nextLine()

    println("Preço do medicamento:")
    var preco = sc.nextDouble()

    when(classe.lowercase(Locale.getDefault())){
        "a" -> {
            calculaPrimeira(preco)
        }
        "b" -> {
            calculaSegunda(preco)
        }
        "c" -> {
            calculaTerceira(preco)
        }
        else -> {
            println("Classe de medicamento não reconhecida.\n")
        }
    }
}

fun calculaPrimeira(preco : Double){
    var desconto = preco*0.1
    var valor = preco*0.9

    println("O desconto correspondente e o valor a se pagar são iguais, respectivamente, a R$ $desconto e R$ $valor.")
}

fun calculaSegunda(preco : Double){
    var desconto = preco*0.15
    var valor = preco*0.85

    println("O desconto correspondente e o valor a se pagar são iguais, respectivamente, a R$ $desconto e R$ $valor.")
}

fun calculaTerceira(preco : Double){
    var desconto = preco*0.2
    var valor = preco*0.8

    println("O desconto correspondente e o valor a se pagar são iguais, respectivamente, a R$ $desconto e R$ $valor.")
}