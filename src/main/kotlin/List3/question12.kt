package List3

import java.util.*
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var numDivisores = 0
    println("Digite um número e eu direi se ele é primo ou não:")
    var numero = sc.nextInt()

    for (divisor in 1 until numero + 1){
        if (numero % divisor == 0){
            numDivisores++
        }
    }
    if (numDivisores == 2){
        println("Número é primo.")
    }
    else{
        println("Número não é primo.")
    }
}