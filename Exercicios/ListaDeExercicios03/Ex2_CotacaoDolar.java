package Exercicios.ListaDeExercicios03;

import java.util.Scanner;

public class Ex2_CotacaoDolar {

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static double lerValorReal() {
        double valor;
        valor = tecladoScanner.nextDouble();
        return valor;
    }

    public static double calcularValorReal(double cotacaoDolar, double valorDolar) {
        double resultado;
        resultado = cotacaoDolar * valorDolar;
        return resultado;
    }

    /*
     * 2. Algoritmo cotação dólar – Elaborar um algoritmo em
     * fluxograma que leia a cotação do dólar, o valor em
     * dólares e mostra o valor correspondente em reais.
     */

    public static void main(String[] args) {
        double cotacaoDolar = 0;
        double valorDolar = 0;
        double valorReal = 0;
        String saida = null;

        // entrada
        imprimir("Informe a cotação do dólar");
        cotacaoDolar = lerValorReal();
        imprimir("Informe o valor em dólares");
        valorDolar = lerValorReal();

        // processamento
        valorReal = calcularValorReal(cotacaoDolar, valorDolar);

        // saida
        saida = "O valor em reais é " + valorReal;
        imprimir(saida);
    }
}