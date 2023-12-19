package List1

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    println("Digite um número:")
    var num = sc.nextInt()

    if (num % 2 == 0){
        println("Número par.")
    }
    else{
        println("Número ímpar.")
    }
}