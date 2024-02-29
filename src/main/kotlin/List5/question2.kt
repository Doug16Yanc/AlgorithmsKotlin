package List5

import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)

    println("Digite a quantidade de notas:")
    var quantidade = sc.nextInt()

    var notas = DoubleArray(quantidade)
    var media = 0.0
    var maiores = 0

    for (i in 0 until quantidade){
        println("Digite a ${i + 1} nota: ")
        notas[i] = sc.nextDouble()

        media += notas[i] / quantidade

        if (notas[i] > media){
            maiores++
        }
    }
    println("A média da turma foi igual a $media.\n")
    println("Houve ${maiores} aluno(s) com a nota maior que a média da turma.\n")

}