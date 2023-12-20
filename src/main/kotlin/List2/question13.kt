package List2

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var i : Int = 0
    var soma : Double = 0.0
    var media : Double = 0.0
    while(i < 4){

        println("Digite a ${i + 1}º nota:")
        var nota = sc.nextDouble()
        i++
        soma += nota
    }
    media = soma/4
    if (media >= 7.0){
        println("Aluno aprovado por média.")
    }
    else{
        if(media < 5.0){
            println("Aluno reprovado por média.")
        }
        else{
            println("Aluno deslocado para avaliação final.\n")
            println("Digite a nota do aluno na prova final:")
            var notaFinal = sc.nextDouble()

            var mediaFinal = (6*(media) + 4*(notaFinal))/10

            if (mediaFinal >= 5.5){
                println("Aprovado quase no último suspiro.")
            }
            else{
                println("Reprovado em via dupla. Sua notinha foi tão mixuruca que eu preferi\n" +
                        "guardar para mim a fim de evitar o mico social, mas já pode implorar\n" +
                        "por vaga nesta mesmíssima cadeira nos próximos semestres, amoreco!\n")
            }
        }
    }
}