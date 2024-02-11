package List4

import java.util.Scanner;

fun main(){

    val sc = Scanner(System.`in`)

    println("Digite um número:")
    var numero = sc.nextInt()

    println("O algarismo das unidades é ${determinaAlgUnidade(numero)}.\n")

}

fun determinaAlgUnidade(numero : Int) : Int {
    var algUnidade = (numero) % 10
    return algUnidade
}