package List3

import java.util.*
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var i = 0
    var soma : Double = 0.0
    println("Informe a quantidade de números:")
    var quantidade = sc.nextInt()

    while(i < quantidade){
        println("Digite o número a fim de calcular a média:")
        var numero = sc.nextDouble()

        soma += numero
        i++
    }
    var media = soma/quantidade
    println("A média do(s) $quantidade elemento(s) é igual a $media.")
}