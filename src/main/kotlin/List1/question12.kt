package List1

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    println("Entre com os segundos:")
    var segundos = sc.nextDouble()

    var horas = (segundos/3600)
    var minutos = (horas*60)%60
    var segundosRes = segundos - (horas.toInt()*3600 + minutos.toInt()*60)

    println("Temos ${horas.toInt()} hora(s), ${minutos.toInt()} minuto(s), ${segundosRes} segundo(s).")
}