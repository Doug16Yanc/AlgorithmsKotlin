package List3

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var i : Int = 0
    var soma : Int = 0
    println("Digite um número inteiro:")
    var numero = sc.nextInt()

    while (i <= numero){
        soma += 2
        i++
    }
    println("Soma dos $numero primeiro(s) número(s) ímpar(es) igual a $soma.")
}