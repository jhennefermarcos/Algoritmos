package Exercicios.ListaDeExercicios04;

import java.util.Scanner;

public class Ex02 {

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static void processar() {
        int i = 0;
        String texto;

        for (i = 200; i >= 1; i = i - 1) {
            texto = "" + i;
            imprimir(texto);
        }
    }

    // 2. Faça um algoritmo que imprima os valores no intervalo entre 200 e 1.
    public static void main(String[] args) {
        processar();
    }
}
