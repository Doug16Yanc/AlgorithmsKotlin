package List3

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var i : Int = 1
    var fatorial : Int = 1
    println("Digite um número:")
    var numero = sc.nextInt()
    do{
        fatorial *= i
        i++
    } while(i <= numero)
    println("Fatorial de $numero igual a $fatorial.")
}