package List1

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    println("Digite o valor do cateto oposto:")
    var oposto = sc.nextDouble()

    println("Digite o valor do cateto adjacente:")
    var adjacente = sc.nextDouble()

    var hipotenusa = Math.sqrt(Math.pow(oposto, 2.0) + Math.pow(adjacente, 2.0))

    if (hipotenusa.isInt()){
        println("Triângulo é retângulo.")
    }
    else{
        println("O triângulo não é retângulo.")
    }
}

fun Double.isInt() = this == this.toInt().toDouble()
