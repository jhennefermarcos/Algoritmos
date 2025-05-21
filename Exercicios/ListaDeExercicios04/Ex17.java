package Exercicios.ListaDeExercicios04;

import java.util.Scanner;

public class Ex17 {

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static int lerValorInteiro() {
        int valor;
        valor = tecladoScanner.nextInt();
        return valor;
    }

    public static long processar() {
        long i = 0;
        long casa = 1;


        for (i = 1; i <= 64; i++) {
            imprimir("Casa: " + i + " - Grãos: " + casa);
            casa = casa * 2;
        }
        return casa;
    }

    /*
     * 17. Uma rainha requisitou os serviços de um monge e disse-lhe que pagaria
     * qualquer preço. O
     * monge, necessitando de alimentos, indagou à rainha sobre o pagamento, se
     * poderia ser feito com
     * grãos de trigo dispostos em um tabuleiro de xadrez (que possui 64 casas), de
     * tal forma que a
     * primeira casa deveria conter apenas um grão e as casas subsequentes, o dobro
     * do quadro anterior.
     * Elaborar um algoritmo para calcular o total de grãos em cada casa e o total
     * que o monge recebeu
     * ao todo.
     */
    public static void main(String[] args) {
        processar();
    } 
}