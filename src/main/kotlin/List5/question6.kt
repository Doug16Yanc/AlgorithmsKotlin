package List5

import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)
    var numeros = mutableListOf<Double>()
    var amplitude = 0.0
    do{
        println("Digite um número real ou -1 para sair do loop")
        var numero = sc.nextDouble()

        if (numero == -1.0){
            break
        }

        numeros.add(numero)
        val maior = numeros.max()
        val menor = numeros.min()
        amplitude = maior - menor
    } while(true)

    println("A amplitude dos números dados é igual a $amplitude")
}