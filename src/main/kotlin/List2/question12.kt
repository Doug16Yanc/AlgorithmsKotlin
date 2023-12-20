package List2


import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val numeros = Array(3) {0}

    for (i in 0 until 3){
        println("Digite o ${i + 1} º número:")
        var numero = sc.nextInt()
        numeros[i] = numero
    }
    println("Os números ordenados:\n")

    for (i in 0 until 2){
        for (j in 0 until 2 - i){
            if (numeros[j] > numeros[j + 1]){
                val aux = numeros[j]
                numeros[j] = numeros[j + 1]
                numeros[j + 1] = aux
            }
        }
    }
    println("Números ordenados:\n")
    for (numero in numeros){
        println("$numero")
    }
}