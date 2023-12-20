package List2

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    println("Digite um primeiro número:")
    var num1 = sc.nextDouble()

    println("Digite um segundo número:")
    var num2 = sc.nextDouble()

    println("Digite um terceiro número:")
    var num3 = sc.nextDouble()

    if (num1 > (num2 + num3) || num2 > (num1 + num3) || num3 > (num1 + num2)){
        println("Números são triangulares.")
    }
    else{
        println("Números não são triangulares.")
    }
}