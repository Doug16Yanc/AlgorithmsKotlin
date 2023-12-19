package List1

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var media : Double = 0.0
    for (i in 1..3){
        println("Digite o $i º número:")
        var numero = sc.nextDouble()
        media += numero
    }
    println("A média dos três números é igual a ${media/3}")
}