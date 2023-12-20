package List2


import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    println("Digite um número real:")
    var num1 = sc.nextDouble()

    println("Digite outro número real:")
    var num2 = sc.nextDouble()

    if(num1 > num2){
        println("O número $num1 é o maior.")
    }
    else if(num2 > num1){
        println("O número $num2 é o maior.")
    }
    else{
        println("Os dois números são iguais.")
    }
}