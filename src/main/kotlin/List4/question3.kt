package List4

import java.util.Scanner;

fun main(){

    val sc = Scanner(System.`in`)
    val vetor = DoubleArray(3)

    for (i in vetor.indices){
        println("Digite o ${i + 1} º elemento do vetor:")
        vetor[i] = sc.nextDouble()

    }
    println("A média dos três números é igual a ${calculaMedia(vetor)}")
}

fun calculaMedia(vetor : DoubleArray) : Double {
    var media = 0.0
    for (i in vetor) {
        media += i
    }
    return media/vetor.size
}