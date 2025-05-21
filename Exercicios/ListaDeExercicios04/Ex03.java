package Exercicios.ListaDeExercicios04;

import java.util.Scanner;

public class Ex03 {

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

        for (i = 0; i <= fim; i++) {
            texto = "" + i;

            // saída
            imprimir(texto);
        }
    }

    /*3. Faça um algoritmo onde o usuário digita um valor, e imprima todos os
     * valores entre 0 e o valor
     * digitado. */
    public static void main(String[] args) {
        // váriaveis
        int inicio = 0;
        int fim = 0;

        imprimir("Digite um número");
        fim = lerValorInteiro();

        processar(inicio, fim);
    }
}
