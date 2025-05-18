package Exercicios.ListaDeExercicios03;

import java.util.Scanner;

public class Ex10_Eleicao {

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
     * 10. Algoritmo eleição - Elabore um Inicio
     * algoritmo em fluxograma que leia a idade
     * de uma pessoa e
     * informe a sua classe eleitoral:
     * • não eleitor (abaixo de 16 anos);
     * • eleitor obrigatório (entre a faixa de 18 e
     * menor de 65 anos);
     * • eleitor facultativo (de 16 até 18 anos e
     * maior de 65 anos, inclusive).
     */

    public static void main(String[] args) {
        int idade = 0;
        String classeEleitoral = null;

        // entrada
        imprimir("Digite a sua idade:");
        idade = lerValorInteiro();

        // processamento
        if (idade < 0) {
            imprimir("Idade inválida. A idade não pode ser negativa.");
        } else if (idade < 16) {
            classeEleitoral = "Não eleitor";
        } else if (idade >= 18 && idade < 65) {
            classeEleitoral = "Eleitor obrigatório";
        } else {
            classeEleitoral = "Eleitor facultativo";
        }

        // saida
        if (idade >= 0) {
            imprimir("Classe eleitoral: " + classeEleitoral);
        }
    }
}