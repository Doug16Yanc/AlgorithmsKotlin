package List1

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    println("Digite a primeira nota:")
    var nota1 = sc.nextDouble()

    println("Digite a segunda nota:")
    var nota2 = sc.nextDouble()

    println("Digite a terceira nota:")
    var nota3 = sc.nextDouble()

    println("Digite a quarta nota:")
    var nota4 = sc.nextDouble()

    var mediaPond = (nota1 + 2*nota2 + 3*nota3 + 4*nota4)/10

    println("As notas do aluno e a sua média são iguais, respectivamente, a $nota1, $nota2, $nota3, $nota4 e $mediaPond")
}