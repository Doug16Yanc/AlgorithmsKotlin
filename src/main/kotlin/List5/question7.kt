package List5

import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    var numeros = mutableListOf<Double>()

    do{
        println("Digite um número ou -1 para encerrar:")
        var numero = sc.nextDouble()

        if (numero == -1.0){
            break
        }

        numeros.add(numero)
    } while(true)

    val numerosUnique = numeros.toMutableSet()

    println(numerosUnique)
}