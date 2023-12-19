package List1

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    println("Digite o salário do funcionário:")
    var salario = sc.nextDouble()

    println("Digite o desconto desse salário:")
    var desconto = sc.nextDouble()

    var salarioLiq = salario - desconto

    println("O salário líquido desse funcionário é igual a R$ $salarioLiq.\n")
}