package List3

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var numero : Double = 0.0
    for (i in 1 until 21){
        numero = Math.pow(i.toDouble(), 2.00)
        println(numero.toInt())
    }
}