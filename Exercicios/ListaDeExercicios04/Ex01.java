package Exercicios.ListaDeExercicios04;

import java.util.Scanner;

public class Ex01 {

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static void processar() {
        int i = 0;
        String texto;

        for (i = 10; i <= 200; i++) {
            texto = "" + i;
            imprimir(texto);
        }
    }

    // 1. Faça um programa que imprima os valores no intervalo entre 10 e 200.
    public static void main(String[] args) {
        processar();
    }
}
