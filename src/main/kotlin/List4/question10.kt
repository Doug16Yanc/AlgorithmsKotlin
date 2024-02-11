package List4

import java.util.Scanner;

fun main(){

    val sc = Scanner(System.`in`)

    println("Digite um número:")
    var numero = sc.nextInt()

    println("O número invertido é igual a ${inverteAlgarismos(numero)}")
}

fun inverteAlgarismos(numero : Int) : Int {
    var numInvertido = 0
    var resto = 0
    var auxiliar = numero
    do{
        resto = auxiliar % 10
        auxiliar = auxiliar / 10
        numInvertido = numInvertido*10 + resto
    } while(auxiliar > 0)
    return numInvertido
}