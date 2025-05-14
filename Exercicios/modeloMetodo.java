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
    } //tirar o Line se não quiser que pegue a linha toda, pegue só o primeiro conjunto

    public static char lerChar() {
        char caracter;
        caracter = tecladoScanner.next().charAt(0);
        return caracter;
    }

    public static double lerValorReal() {
        double valor;
        valor = tecladoScanner.nextDouble();
        return valor;
    } //byte, float, long, short

    public static int lerValorInteiro() {
        int valor;
        valor = tecladoScanner.nextInt();
        return valor;
    } //byte, float, long, short

    public static boolean lerValorBoolean() {
        boolean sentença;
        sentença = tecladoScanner.hasNextBoolean();
        return sentença;
    } //verificar
}