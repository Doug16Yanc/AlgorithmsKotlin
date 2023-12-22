package List3

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    println("Digite um número real:")
    var numero = sc.nextDouble()

    var num = numero - numero.toInt()

    println("Parte decimal correspondente: $num.")
}