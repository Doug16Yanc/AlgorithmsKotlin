package List5

import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    var numeros = mutableListOf<Double>()

    do {
        println("Digite um número ou -1 para encerrar o loop:")
        var numero = sc.nextDouble()
        numeros.add(numero)

        if (numero == -1.0){
            break
        }
    } while (true)

    numeros.sort()
    println(numeros)
}