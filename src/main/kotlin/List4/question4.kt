package List4

import java.util.Scanner;

fun main(){

    val sc = Scanner(System.`in`)
    val vetor = DoubleArray(3)

    for (i in vetor.indices){
        println("Digite o ${i + 1} º elemento do vetor:")
        vetor[i] = sc.nextDouble()

    }
    println("O maior dos três números é igual a ${determinaMaior(vetor)}")
}

fun determinaMaior(vetor : DoubleArray) : Double {
    var maior = 0.0
    for (i in vetor) {
        if (i > maior){
          maior = i
        }
    }
    return maior
}