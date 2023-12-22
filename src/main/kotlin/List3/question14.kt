package List3

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var i : Double = 0.0
    var soma : Double = 0.0

    println("Digite um número para fazer a soma da série considerando esse número como limite:")
    var numero = sc.nextInt()

    while(i < numero){
        soma += (1 + 2*i)/(2 + 3*i)
        i++
    }
    println("Soma da série igual a $soma.")
}