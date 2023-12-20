package List2

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    println("Digite, em reais, o total gasto:")
    var gasto = sc.nextDouble()

    println("Digite, em reais, a quantidade que a mulher pagou:")
    var gastoF = sc.nextDouble()

    println("Digite, em reais, a quantidade que o homem pagou:")
    var gastoM = sc.nextDouble()

    var percentualF = gasto*0.65
    var percentualM = gasto*0.35
    var totalF = gastoF - percentualF
    var totalM = gastoM - percentualM

    if (totalF > 0.0){
        println("A mulher deveria ter pago R$ $percentualF, desse modo, um gasto adicional de R$ $totalF e " +
                "da parte do homem um ganho inadequado de mesmo valor.")
    }
    else if (totalM > 0.0) {
        println("O homem deveria ter pago R$ $percentualM, desse modo, um gasto adicional de R$ $totalM e " +
                "da parte da mulher um ganho inadequado de mesmo valor.")
    }
    else{
        println("Valores coerentes referentes aos pagamentos efetuados por ambos.")
    }

}