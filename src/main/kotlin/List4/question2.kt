package List4

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    println("Digite o salário do funcionário:")
    var salario = sc.nextDouble()

    println("Digite o desconto do funcionário:")
    var desconto = sc.nextDouble()

    println("O salário líquido do funcionário é igual a ${calculaSalarioLiquido(salario, desconto)}.")
}
fun calculaSalarioLiquido(salario : Double, desconto : Double) : Double{
    var salarioLiquido = salario - desconto
    return salarioLiquido
}