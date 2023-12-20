package List2

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    println("Digite um número real:")
    var numero = sc.nextDouble()

    var numInt = numero.toInt()
    var frac = numero - numInt

    if (frac >= 0.5){
        numInt += 1
    }
    else{
        numInt
    }
    println("O número com arredondamento adequado é igual a $numInt.")
}