package List4

import java.util.Scanner;

fun main(){

    val sc = Scanner(System.`in`)

    println("Digite um número:")
    var numero = sc.nextInt()

    println("O algarismo das dezenas é ${determinaAlgDezena(numero)}.\n")

}

fun determinaAlgDezena(numero : Int) : Int {
    var algDezena = (numero / 10) % 10
    return algDezena
}