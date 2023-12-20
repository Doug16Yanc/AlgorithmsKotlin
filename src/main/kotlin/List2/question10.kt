package List2


import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val quantidade = 3
    val aluno = Array(quantidade) {""}
    val notas = Array(quantidade) {0.0}
    var maior : Double = 0.0
    var menor : Double = 1000.00

    for (i in 0 until quantidade){
        println("Digite o nome do ${i + 1} º aluno:")
        aluno[i] = sc.next()

        sc.nextLine()

        println("Digite a nota desse aluno:")
        var nota = sc.nextDouble()
        notas[i] = nota

        if (maior > notas[i]){
            notas[i] = maior
            println("O aluno com a maior nota é ${aluno[i]} com nota igual a $maior")

        }
        if (menor < notas[i]){
            notas[i] = menor
            println("O aluno com a menor nota é ${aluno[i]} com nota igual a $menor")

        }
    }
    /*
    println("O aluno com a nota do meio é $aluno com nota igual a $")*/

}