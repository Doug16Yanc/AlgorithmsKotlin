package List5

import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)
    var numeros = mutableListOf<Int>()
    do{
        println("Digite um número ou -1 para sair do loop:")
        var numero = sc.nextInt();

        if (numero == -1){
            break
        }
        numeros.add(numero)
    } while(true)

    val invertidos = numeros.reversed()

    println("Números invertidos: $invertidos")
}