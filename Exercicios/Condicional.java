package Exercicios;
import java.util.Scanner;

public class Condicional {
    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimir(String texto){ 
        System.out.println(texto);
    } 

    public static double lerValorReal(){
        double valor;
        valor = tecladoScanner.nextDouble();
        return valor;
    }

    public static int lerValorInteiro(){
        int valor;
        valor  = tecladoScanner.nextInt();
        return valor;
    }

    public static void main(String[] args) {
        int nota=0;

        imprimir("Informe a nota:");
        nota = lerValorInteiro();

        if( nota >= 7 ){
            imprimir("Passou!!!");
        }else{
            imprimir("Reprovou!!!");
        }
        
        imprimir("Acabou o programa");
    }
}
