package List1

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    println("Valor do coeficiente de A:")
    var valor1 = sc.nextInt()

    println("Valor do coeficiente de B:")
    var valor2 = sc.nextInt()

    println("Valor do coeficiente de C:")
    var valor3 = sc.nextInt()

    var delta = Math.pow(valor2.toDouble(), 2.0) - 4*valor1*valor3
    var raiz1 = (- valor2 + Math.sqrt(delta))/2
    var raiz2 = (- valor2 - Math.sqrt(delta))/2

    println("As raízes são iguais a $raiz1 e $raiz2.")
}