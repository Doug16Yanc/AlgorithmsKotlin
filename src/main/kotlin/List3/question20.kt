package List3

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    var votoA : Int = 0
    var votoB : Int = 0
    var votoC : Int = 0
    var branco : Int = 0
    var nulo : Int = 0
    println("************************************\n")
    println("Votos possíveis\tNúmero\n")
    println("   Candidato A \t 12\n")
    println("   Candidato B \t 43\n")
    println("   Candidato C \t 57\n")
    println("   Branco \t      0\n")
    println("   Nulo \t qualquer número\n")

    do{
        println("Digite o voto ou -1 para encerrar a eleição:")
        var voto = sc.nextInt()

        when(voto){
            12 -> votoA++
            43 -> votoB++
            57 -> votoC++
            0 -> branco++
            else -> nulo++
        }
        if (voto == -1){
            break
        }
    }while(true)

    println("Votos possíveis\tQuantidade absoluta\n")
    println("   Candidato A \t $votoA\n")
    println("   Candidato B \t $votoB\n")
    println("   Candidato C \t $votoC\n")
    println("   Branco \t     $branco\n")
    println("   Nulo \t       $nulo\n")
}