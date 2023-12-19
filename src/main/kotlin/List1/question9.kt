package List1

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    println("Digite o valor da mercadoria:")
    var mercadoria = sc.nextDouble()

    var valor = mercadoria % 3

    when(valor.toInt()){
        0 -> devolveIgual(mercadoria)
        else -> devolveDiferente(valor, mercadoria)
    }
}

fun devolveIgual( mercadoria : Double){
    var pagamento = mercadoria / 3
    println("O valor da entrada e das duas prestações serão iguais a R$ ${pagamento}")
}

fun devolveDiferente(valor : Double, mercadoria : Double){
    var remove = mercadoria - valor
    var resto = (remove / 3) + valor
    var prestacao = (mercadoria - resto) / 2
    println("O valor da entrada será igual a R$ ${resto} e das duas prestações será igual a R$ ${prestacao}.\n")
}
