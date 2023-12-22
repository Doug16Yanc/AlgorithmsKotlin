package List3

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var i : Int = 0
    var soma : Double = 0.0
    println("Digite um número inteiro positivo:")
    var numero = sc.nextInt()

    if (numero >= 0){
        for (i in 1 until numero + 1){
            soma = (1 - (i)/(32 + i*(20))).toDouble()
        }
        println("Soma da série igual a $soma.")
    }
    else{
        println("Número não possível.")
    }
}