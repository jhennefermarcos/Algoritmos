package Exercicios.ListaDeExercicios03;

import java.util.Scanner;

public class Ex5_Numeral {

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static String lerTexto() {
        String texto;
        texto = tecladoScanner.nextLine();
        return texto;
    }

    public static int lerValorInteiro() {
        int valor;
        valor = tecladoScanner.nextInt();
        return valor;
    }

    /*5. Algoritmo numeral – Elaborar um algoritmo em fluxograma que leia um valor inteiro e
    classifique-o se positivo, negativo ou zero. */

    public static void main(String[] args) {
        String posNeg = null;
        int numero = 0;

    imprimir("Digite um número:");
    numero = lerValorInteiro();

    if (numero>0) {
        posNeg = "Positivo";
    }else{
        posNeg = "Negativo";
    }

    imprimir(posNeg);
    }
}