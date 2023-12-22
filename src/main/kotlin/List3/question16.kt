package List3

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var celsius : Double = 0.0
    for (i in 0 until 151){
        celsius = (5*(i -32)/9).toDouble()
        println(celsius)
    }
}