package List2

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    println("Digite um número real:")
    var num1 = sc.nextDouble()

    println("Digite outro número real:")
    var num2 = sc.nextDouble()

    var intNum1 = num1.toInt()
    var intNum2 = num2.toInt()
    var floatNum1 = num1 % 1
    var floatNum2 = num2 % 1

    val epsilon = 1e-10

    if (intNum1 == intNum2 || Math.abs(floatNum1 - floatNum2) < epsilon || num1 == num2){
        println("Os números digitados têm pelo menos alguma parte igual.")
    }
    else{
        println("Números distintos.")
    }
}