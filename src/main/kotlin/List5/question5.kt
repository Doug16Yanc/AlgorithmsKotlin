package List5

import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)
    var pares = mutableListOf<Int>()
    var impares = mutableListOf<Int>()

    do{
        println("Digite um número ou -1 para sair do loop:")
        var numero = sc.nextInt()

        if (numero == -1){
            break
        }

        if (numero % 2 == 1){
            impares.add(numero)
        }
        else{
            pares.add(numero)
        }

    } while(true)
    println("Vetor dos ímpares: $impares\n")
    println("Vetor dos pares: $pares")
}