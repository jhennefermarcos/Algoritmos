package Exercicios.ListaDeExercicios04;

import java.util.Scanner;

public class Ex06 {

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static int lerValorInteiro() {
        int valor;
        valor = tecladoScanner.nextInt();
        return valor;
    }

    public static int processar(int inicio, int fim) {
        int i = 0;
        int acumulador = 0;

        for (i = inicio; i <= fim; i++) {
            acumulador = acumulador + i;
        }

        return acumulador;
    }

    /*
     * 6. Faça um algoritmo que imprima a soma dos
     * valores de um intervalo definido pelo usuário.
     */
    public static void main(String[] args) {
        // váriaveis
        int inicio = 0;
        int fim = 0;
        int soma = 0;

        imprimir("Digite um número de inicio");
        inicio = lerValorInteiro();
        imprimir("Digite o valor final");
        fim = lerValorInteiro();

        soma = processar(inicio, fim);

        imprimir("A soma de " + inicio + " e de " + fim + " foi de " + soma);
    }
}
