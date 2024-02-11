package List4

import java.util.Scanner;

fun main(){

    val sc = Scanner(System.`in`)

    println("Digite um número:")
    var numero = sc.nextInt()

    if (determinaPrimo(numero) == true){
        println("O número é primo.\n")
    }
    else {
        println("O número não é primo.\n")
    }

}

fun determinaPrimo(numero : Int): Boolean {
    var ePrimo = false
    var qtdDivisores = 0
    for (i in 1..numero){
        if (numero % i == 0){
            qtdDivisores += 1
        }
    }
    if (qtdDivisores == 2 && numero != 1){
        ePrimo = true
    }
    return ePrimo
}