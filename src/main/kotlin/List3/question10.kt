package List3
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    println("Digite um número:")
    var numero = sc.nextInt()

    println("Divisores do número dado.")
    for (i in 1 until numero){
        if (numero % i == 0){
            println(i)
        }
    }
}