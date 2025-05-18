package Exercicios.ListaDeExercicios03;

import java.util.Scanner;

public class Ex12_Natacao {

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
     * 12. Algoritmo natação - A confederação brasileira de natação irá promover
     * eliminatórias para o
     * próximo mundial de natação das categorias de base. Elabore um algoritmo em
     * fluxograma que
     * receba a idade de um nadador e determine (imprima) a sua idade e a categoria
     * segundo a tabela
     * a seguir:
     * 
     * Categoria Idade
     * Infantil A 3 – 5 anos
     * Infantil B 6 – 9 anos
     * Juvenil A 10 – 13 anos
     * Juvenil B 14 – 17 anos
     * Sênior Maiores de 18 anos
     */

    public static void main(String[] args) {
        int idade = 0;
        String categoria = null;

        // entrada
        imprimir("Digite a idade do nadador:");
        idade = lerValorInteiro();

        // processamento
        if (idade < 3) {
            imprimir("Idade inválida. A idade deve ser maior ou igual a 3 anos.");
        } else if (idade <= 5) {
            categoria = "Infantil A";
        } else if (idade <= 9) {
            categoria = "Infantil B";
        } else if (idade <= 13) {
            categoria = "Juvenil A";
        } else if (idade <= 17) {
            categoria = "Juvenil B";
        } else {
            categoria = "Sênior";
        }

        // saida
        if (idade >= 3) {
            imprimir("Categoria: " + categoria);
        }
    }
}
