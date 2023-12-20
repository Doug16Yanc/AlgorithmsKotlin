package List2

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val numeros = Array(3) {0}
    var maior : Int = 0
    for (i in 0 until 3){
        println("Digite um número inteiro:")
        var numero = sc.nextInt()
        numeros[i] = numero

        if  (numeros[i] > maior){
            maior = numeros[i]
        }
    }
    println("O maior número é $maior.")

}