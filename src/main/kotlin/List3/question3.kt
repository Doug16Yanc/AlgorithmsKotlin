package List3

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var i = 0
    var maior : Int = 0

    do {
        println("Digite um número inteiro:")
        var numero = sc.nextInt()

        if (numero > maior){
            maior = numero
        }
        i++
    } while(i < 10)
    println("O maior número dos dez digitados é $maior.")
}