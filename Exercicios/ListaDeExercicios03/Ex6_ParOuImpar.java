package Exercicios.ListaDeExercicios03;

import java.util.Scanner;

public class Ex6_ParOuImpar {

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
     * 6. Algoritmo par ou ímpar – Elaborar
     * um algoritmo em fluxograma que
     * solicite para o usuário
     * digitar um valor inteiro maior que
     * zero e verifique se este valor é par ou
     * ímpar.
     */

    public static void main(String[] args) {
        int numero = 0;
        String parOuImpar = null;

        // entrada
        imprimir("Digite um número inteiro maior que zero:");
        numero = lerValorInteiro();

        // processamento
        if(numero <= 0) {
            imprimir("Número inválido. O número deve ser maior que zero.");}
        if (numero % 2 == 0) {
            parOuImpar = "Par";
        } else {
            parOuImpar = "Ímpar";
        }

        // saida
        imprimir("O número " + numero + " é " + parOuImpar);
    }
}
