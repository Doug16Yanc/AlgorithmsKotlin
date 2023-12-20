package List2

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    println("Digite um número inteiro:")
    var numero = sc.nextInt()

    var dezena = Math.abs(numero/10)%10
    println("O algarismo das dezenas é $dezena.")
}