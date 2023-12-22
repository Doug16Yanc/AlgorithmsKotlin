package List3

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var i = 0

    do {
        println("Digite um número inteiro:")
        var numero = sc.nextInt()

        if (numero >= 50 && numero <= 90) {
            println("Número presente no intervalo de 50 a 90.\n")
        }
        i++
    } while(i < 10)
}