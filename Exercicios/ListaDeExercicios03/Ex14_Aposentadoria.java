package Exercicios.ListaDeExercicios03;

import java.util.Scanner;

public class Ex14_Aposentadoria {

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static int lerValorInteiro() {
        int valor;
        valor = tecladoScanner.nextInt();
        return valor;
    }

    /*
     * 14. Algoritmo aposentadoria – Elabore um algoritmo 
     * em fluxograma para ler a idade e o tempo
     * de serviço de um trabalhador e escreva se 
     * ele pode se aposentar. As condições de 
     * aposentadoria são:
     * • Ter pelo menos 65 anos,
     * • ou ter trabalhado pelo menos 30 anos,
     * • ou ter pelo menos 60 anos de idade e 
     * trabalhado pelo menos 25 anos.
     */

    public static void main(String[] args) {
        int idade = 0;
        int tempoDeServico = 0;

        // entrada
        imprimir("Digite a sua idade:");
        idade = lerValorInteiro();
        imprimir("Digite o tempo de serviço (em anos):");
        tempoDeServico = lerValorInteiro();

        // processamento
        if (idade < 0 || tempoDeServico < 0) {
            imprimir("Idade ou tempo de serviço inválido.");
        } else if (idade >= 65 || tempoDeServico >= 30 || (idade >= 60 && tempoDeServico >= 25)) {
            imprimir("Você pode se aposentar.");
        } else {
            imprimir("Você não pode se aposentar.");
        }
    }

}
