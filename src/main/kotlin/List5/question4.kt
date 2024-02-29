package List5

import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)

    println("Digite a quantidade de números que devem ser inseridos:")
    var quantidade = sc.nextInt()

    var numeros = DoubleArray(quantidade)
    var impares = DoubleArray((quantidade + 1) / 2)
    var pares = DoubleArray(quantidade / 2)

    for (i in 0 until quantidade){
        println("Digite o ${i + 1} número:")
        numeros[i] = sc.nextDouble()

        if (i % 2 == 1){
            impares[i / 2] = numeros[i]
        }
        else{
            pares[i / 2] = numeros[i]
        }
    }
    println("Números de índice ímpar: $impares\n")
    println("Números de índice par: $pares")
}