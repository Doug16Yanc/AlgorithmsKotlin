package List1

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    println("Entre com os segundos:")
    var segundos = sc.nextDouble()

    var horas = (segundos/3600)
    var minutos = (horas*60)%60
    var segundosRes = segundos%3600

    println("Temos ${horas.toInt()} hora(s), ${minutos.toInt()} minuto(s), ${segundosRes.toInt()} segundo(s).")
}