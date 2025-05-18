package Exercicios.ListaDeExercicios03;

import java.util.Scanner;

public class Ex8_AlgoritmoDia {

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
     * 8. Algoritmo dia – Elaborar um
     * algoritmo em fluxograma que leia um
     * valor inteiro representando
     * o dia da semana, verifique e imprima o
     * dia correspondente.
     * Exemplo: Entrada = 5; Saída =
     * Quinta-feira.
     * Fazer a validação se é o número
     * digitado é valido, caso não seja
     * imprimir uma mensagem informando.
     */

    public static void main(String[] args) {
        int dia = 0;
        String diaDaSemana = null;

        // entrada
        imprimir("Digite um número de 1 a 7 representando o dia da semana:");
        dia = lerValorInteiro();

        // processamento
        if (dia <= 0 || dia > 7) {
            imprimir("Número inválido. O número deve ser entre 1 e 7.");
        } else if (dia == 1) {
            diaDaSemana = "Domingo";
        } else if (dia == 2) {
            diaDaSemana = "Segunda-feira";
        } else if (dia == 3) {
            diaDaSemana = "Terça-feira";
        } else if (dia == 4) {
            diaDaSemana = "Quarta-feira";
        } else if (dia == 5) {
            diaDaSemana = "Quinta-feira";
        } else if (dia == 6) {
            diaDaSemana = "Sexta-feira";
        } else {
            diaDaSemana = "Sábado";
        }

        // saida
        if (dia > 0 && dia <= 7) {
            imprimir("O dia da semana correspondente ao número " + dia + " é " + diaDaSemana);
        }
    }

}
