package List2

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    println("Digite um número:")
    var numero1 = sc.nextDouble()

    println("Digite um outro número:")
    var numero2 = sc.nextDouble()

    var divisao = numero1 / numero2

    if (numero2 != 0.0){
        println("O resultado da divisão é igual a $divisao.")
    }
    else{
        println("Não é possível dividir por zero na matemática.")
    }
}