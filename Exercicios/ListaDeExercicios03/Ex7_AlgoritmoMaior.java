package Exercicios.ListaDeExercicios03;
import java.util.Scanner;

public class Ex7_AlgoritmoMaior {
    
    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static int lerValorInteiro() {
        int valor;
        valor = tecladoScanner.nextInt();
        return valor;
    }


    /*7. Algoritmo maior – Elaborar um
algoritmo em fluxograma que leia três
valores inteiros distintos e diga qual é
o maior valor digitado. */

public static void main(String[] args) {
    int numero1 = 0;
    int numero2 = 0;
    int numero3 = 0;
    int maior = 0;

    // entrada
    imprimir("Digite o primeiro número:");
    numero1 = lerValorInteiro();
    
    imprimir("Digite o segundo número:");
    numero2 = lerValorInteiro();
    
    imprimir("Digite o terceiro número:");
    numero3 = lerValorInteiro();

    // processamento
    if (numero1 > numero2 && numero1 > numero3) {
        maior = numero1;
    } else if (numero2 > numero1 && numero2 > numero3) {
        maior = numero2;
    } else {
        maior = numero3;
    }

    // saida
    imprimir("O maior número é: " + maior);
}



}
