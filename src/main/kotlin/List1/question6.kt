package List1

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    println("Digite uma temperatura em º F:")
    var fahr = sc.nextDouble()

    var celsius = (5*(fahr - 32))/9

    println("A temperatura correspondente em Celsius é igual a $celsius.\n")
}