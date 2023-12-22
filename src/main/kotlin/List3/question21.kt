package List3

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    println("Digite, em reais, o valor pago pelo cliente:")
    var valor = sc.nextDouble()

    when(valor){
        3.0 -> println("Obrigado e volte sempre.")
        else -> calculaValor()
    }
}

fun calculaValor(){

}