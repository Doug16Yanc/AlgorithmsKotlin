package List1

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var notas : DoubleArray = doubleArrayOf(0.0)

    println("Digite, em R$, o valor que desejas sacar:")
    var valor = sc.nextDouble()

    realizaSaque(valor, notas, 0)

    for (i in 0 until 5){
        println("${notas[i]}")
    }
}

fun realizaSaque(valor : Double, notas : DoubleArray, index : Int){
    var valores_notas = arrayOf(2.00, 5.00, 10.00, 20.00, 50.00, 100.00)

    notas[index] = valor/valores_notas[index]
    realizaSaque(valor % valores_notas[index], notas, index)
}