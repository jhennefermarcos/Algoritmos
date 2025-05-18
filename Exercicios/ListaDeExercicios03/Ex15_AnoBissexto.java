package Exercicios.ListaDeExercicios03;

import java.util.Scanner;

public class Ex15_AnoBissexto {

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
     * 15. Algoritmo bissexto – Elabore um algoritmo em fluxograma para determinar
     * se um ano é
     * bissexto. Para ser um ano bissexto deve ser divisível por 400 ou ser
     * divisível por 4 e não for
     * divisível por 100. O usuário vai digitar um valor inteiro.
     */

    public static void main(String[] args) {
        int ano = 0;

        // entrada
        imprimir("Digite um ano:");
        ano = lerValorInteiro();

        // processamento
        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            imprimir(ano + " é um ano bissexto.");
        } else {
            imprimir(ano + " não é um ano bissexto.");
        }
    }
}
