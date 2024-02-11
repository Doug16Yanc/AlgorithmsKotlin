package List4

import java.util.Scanner;

fun main(){

    val sc = Scanner(System.`in`)

    println("Digite um número:")
    var numero = sc.nextInt()

    println("O fatorial do número digitado é igual a ${determinaFatorial(numero)}")
}

fun determinaFatorial(numero : Int) : Int {
    var fatorial = 1

    for (i in 1 until numero){
        fatorial = fatorial * i
    }
    return fatorial
}