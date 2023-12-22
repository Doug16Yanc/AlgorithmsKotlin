package List3

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    var reverso : Int = 0
    println("Digite um número:")
    var numero = sc.nextInt()

    while(numero > 0){
        var digito = numero % 10
        reverso = (reverso*10) + digito
        numero /= 10
    }
    println("O número invertido correspondente é $reverso.")
}