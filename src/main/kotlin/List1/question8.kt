package List1

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    println("Digite um número :")
    var num1 = sc.nextDouble()

    println("Digite outro número:")
    var num2 = sc.nextDouble()

    var aux = num1
    num1 = num2
    num2 = aux

    println("Os números trocados são $num1 e $num2.")
}