package Exercicios.ListaDeExercicios03;

import java.util.Scanner;

public class Ex4_ConsumoGasolina {

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static double lerValorReal() {
        double valor;
        valor = tecladoScanner.nextDouble();
        return valor;
    }

    public static double calcularConsumo(double distancia, double combustivel) {
        double resultado;
        resultado = distancia / combustivel;
        return resultado;
    }

    /*
     * 4 - Algoritmo consumo – Elaborar um
     * algoritmo em fluxograma que calcule o
     * consumo médio
     * de um automóvel sendo fornecidos a
     * distância total percorrida (em Km) e o
     * total de combustível
     * gasto (em litros).
     * Entrada: A entrada contém dois
     * valores: um valor inteiro dist
     * representando a distância total
     * percorrida (em Km), e um valor real
     * gasto representando o total de
     * combustível gasto.
     * Saída: Apresente o valor que
     * representa o consumo médio do
     * automóvel seguido da mensagem
     * "km/l".
     */

    public static void main(String[] args) {
        double distancia = 0;
        double combustivel = 0;
        double consumo = 0;
        String saida = null;

        // entrada
        imprimir("Informe a distância total percorrida (em Km)");
        distancia = lerValorReal();
        imprimir("Informe o total de combustível gasto (em litros)");
        combustivel = lerValorReal();

        // processamento
        consumo = calcularConsumo(distancia, combustivel);

        // saida
        saida = "O consumo médio do automóvel é " + consumo + " km/l";
        imprimir(saida);
    }
}
