package List3

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var i : Int = 0
    var soma : Double = 0.0
    println("Digite um número inteiro para que eu faça a soma dos quadrados dos n primeiros números:")
    var numero = sc.nextInt()

    while (i <= numero){
        soma += Math.pow(i.toDouble(), 2.00)
        i++
    }
    println("Soma igual a ${soma.toInt()}.")
}