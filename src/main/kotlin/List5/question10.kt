package List5

import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    var numerosA = mutableListOf<Double>()
    var numerosB = mutableListOf<Double>()
    var numeros = mutableListOf<Double>()
    var igual = false
    do {
        println("Digite um número ou -1 para encerrar o preenchimento da lista A:")
        var numero = sc.nextDouble()
        numerosA.add(numero)

        if (numero == -1.0){
            break
        }
    } while(true)

    do{
        println("Digite um número ou -1 para encerrar o preenchimento da lista B:")
        var numero = sc.nextDouble()
        numerosB.add(numero)

        if (numero == -1.0){
            break
        }
    } while(true)

    for (i in numerosA){
        for (j in numerosB){
            if (i == j){
                igual = true
            }
            if (!igual) {
                numeros.add(i)
            }
        }
    }
    println("Os valores de A que não estão em B são : ${numeros}")
}