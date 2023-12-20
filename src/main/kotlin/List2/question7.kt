package List2

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    val random = Random()
    val numero = random.nextInt(5) + 1
    var tentativas = 3

    do {
        println("Adivinhe o número de 1 a 5:")
        var num = sc.nextInt()

        if (num == numero) {
            println("Parabéns, você acertou o número")
            break
        } else if (num != numero && tentativas > 0){
            tentativas--
            println("Não é este, tente novamente, enquanto tem mais $tentativas tentativas.")
        }
    } while(tentativas > 0)


}
