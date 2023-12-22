package List4

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    println("Digite a primeira nota do aluno:")
    var nota1 = sc.nextDouble()

    println("Digite a segunda nota do aluno:")
    var nota2 = sc.nextDouble()

    var resultado = calculaMedia(nota1, nota2)

    println("A média do aluno nas duas notas é igual a $resultado.")
}

fun calculaMedia(nota1 : Double, nota2 : Double): Double {
    var media = (nota1 + nota2)/2
    return media
}