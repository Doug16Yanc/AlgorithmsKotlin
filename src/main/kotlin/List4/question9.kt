package List4

import java.util.Scanner;

fun main(){

    val sc = Scanner(System.`in`)

    println("Digite um número:")
    var numero = sc.nextInt()

    println("O ${numero}º algarismo da sequência de Fibonacci é igual a ${determinaAlgFibonacci(numero)}")

}

fun determinaAlgFibonacci(numero : Int) : Int {
    var anterior = 0
    var proximo = 1
    var fibo = 0
    for (i in 2..numero) {
        fibo = anterior + proximo
        anterior = proximo
        proximo = fibo
    }
    return fibo
}