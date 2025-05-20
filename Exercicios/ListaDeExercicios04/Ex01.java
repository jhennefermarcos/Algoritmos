package Exercicios.ListaDeExercicios04;

import Exercicios.modeloMetodo;

public class Ex01 {

        //1. Faça um programa que imprima os valores no intervalo entre 10 e 200.
    public static void main(String[] args) {
        int inicio = 10;
        int fim = 200;
        int contador = inicio;

        while (contador <= fim) {
            Exercicios.modeloMetodo.imprimir("Contador: "+contador);
            contador ++;
        }

        modeloMetodo.imprimir("Acabou");
    }
}     
