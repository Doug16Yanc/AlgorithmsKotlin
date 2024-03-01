package List5

import java.util.Scanner
fun main(){
   val sc = Scanner(System.`in`)
    var validacao = false
    println("Digite a quantidade de números: ")
    var quantidade = sc.nextInt()

    var numeros = mutableListOf<Double>()
    for (i in 0 until quantidade){
        println("Digite um número:")
        var numero = sc.nextDouble()

        numeros.add(numero)
    }
    println("Digite um número correspondente ao índice que deve ser removido: ")
    var indice = sc.nextInt()

    if (indice >= 0 && indice <= numeros.size){
        numeros.removeAt(indice)
        validacao = true
    }

    if(validacao){
        println(numeros.joinToString())
    }
    else{
        println("Desculpe, mas este índice não existe.\n")
    }

}