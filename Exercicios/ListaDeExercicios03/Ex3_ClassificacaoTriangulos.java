package Exercicios.ListaDeExercicios03;

import java.util.Scanner;

public class Ex3_ClassificacaoTriangulos {
    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static double lerValorReal() {
        double valor;
        valor = tecladoScanner.nextDouble();
        return valor;
    }

    public static int lerValorInteiro() {
        int valor;
        valor = tecladoScanner.nextInt();
        return valor;
    }

    /*
     * 3. Algoritmo Classificação Triângulo –
     * Elaborar um algoritmo em fluxograma
     * que leia os três
     * lados de um triângulo e classifique-o
     * como sendo:
     * • Equilátero: possui os três lados
     * iguais; isósceles
     * • Isósceles: possui pelo menos dois
     * lados iguais;
     * • Escaleno: três lados distintos
     */

    public static void main(String[] args) {
        double ladoA = 0;
        double ladoB = 0;
        double ladoC = 0;
        String classificacao = null;

        // entrada
        imprimir("Informe o lado A do triângulo");
        ladoA = lerValorReal();
        imprimir("Informe o lado B do triângulo");
        ladoB = lerValorReal();
        imprimir("Informe o lado C do triângulo");
        ladoC = lerValorReal();

        // processamento
        if (ladoA == ladoB && ladoB == ladoC) {
            classificacao = "Equilátero";
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            classificacao = "Isósceles";
        } else {
            classificacao = "Escaleno";
        }

        // saida
        imprimir("O triângulo é " + classificacao);
    }
}
