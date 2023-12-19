package List1

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    println("Entre com os minutos:")
    var minutos = sc.nextDouble()

    var hora = minutos.toInt()/60
    var minutosRes = minutos.toInt() % 60
    var segundos = (minutos - minutos.toInt())*60

    println("Temos $hora hora(s), $minutosRes minuto(s) e $segundos segundo(s).")


}