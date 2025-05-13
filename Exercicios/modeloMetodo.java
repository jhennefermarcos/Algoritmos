package Exercicios;
import java.util.Scanner;

public class modeloMetodo {

    public static Scanner tecladoScanner = new Scanner(System.in);       
    
    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static String lerTexto() {
        String texto;
        texto = tecladoScanner.nextLine();
        return texto;
    }

    public static char lerChar() {
        char caracter;
        caracter = tecladoScanner.next().charAt(0);
        return caracter;
    }

    public static double lerValorReal() {
        double valor;
        valor = tecladoScanner.nextDouble();
        return valor;
    }

    public static int lerValorInteiro() {
        int valor;
        valor = tecladoScanner.nextInt();
        return valor;
    }
}