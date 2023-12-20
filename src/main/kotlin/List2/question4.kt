package List2

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    println("Digite o comprimento da casa:")
    var compri = sc.nextDouble()

    println("Digite a largura da casa:")
    var largura = sc.nextDouble()

    var diagonal = Math.sqrt(Math.pow(compri, 2.0) + Math.pow(largura, 2.0))

    println("A quantidade de fio necessária será ${diagonal*4} unidades de comprimento.")
}