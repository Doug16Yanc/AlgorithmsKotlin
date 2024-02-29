package List5

import java.util.Scanner;
fun main(){
    val sc = Scanner(System.`in`)
    var maior = 0.0
    var menor = 100000.0
    println("Digite a quantidade notas que serão avaliadas: ")
    var quantidade = sc.nextInt();
    var notas = DoubleArray(quantidade);

    for (i in 0 until quantidade){
        println("Digite a ${i + 1} nota:")
        notas[i] = sc.nextDouble()

        if (notas[i] > maior){
            maior = notas[i]
        }
        if (notas[i] < menor){
            menor = notas[i]
        }
    }
    println("A maior e a menor nota são iguais respectivamente a $maior e $menor.")
}
