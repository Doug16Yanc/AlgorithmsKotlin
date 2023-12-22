package List3

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var i = 0
    var quantidade = 0

    do {
        println("Digite um número inteiro:")
        var numero = sc.nextInt()

        if (numero >= 50 && numero <= 90) {
            quantidade++
        }
        i++
    } while(i < 10)
    println("Há $quantidade número(s) presente(s) no intervalo de 50 a 90.")
}