package Exercicios.ListaDeExercicios04;

import java.util.Scanner;

public class Ex05 {

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static int lerValorInteiro() {
        int valor;
        valor = tecladoScanner.nextInt();
        return valor;
    }

    public static void processar(int inicio, int fim) {
        int i = 0;
        String texto;

        for (i = inicio; i <= fim; i++) {
            texto = "" + i;

            // saída
            if (i % 2 == 0) {
                imprimir(texto);
            }

        }
    }

    /*5. Faça um algoritmo que imprima todos os números pares de um intervalo
     * informado pelo usuário.*/
    public static void main(String[] args) {
        // váriaveis
        int inicio = 0;
        int fim = 0;

        imprimir("Digite um número de inicio");
        inicio = lerValorInteiro();
        imprimir("Digite o valor final");
        fim = lerValorInteiro();

        processar(inicio, fim);
    }
}
