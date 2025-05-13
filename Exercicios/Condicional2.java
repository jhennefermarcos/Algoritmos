package Exercicios;
import java.util.Scanner;

public class Condicional2 {
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
        int qntLivros = 0;

        imprimir("Informe a quantidade de livros:");
        qntLivros = lerValorInteiro();

        if( qntLivros < 5 ){
            imprimir("Categoria 1");
        }else if (qntLivros < 10) {
            imprimir("Categoria 2");
        }else{
            imprimir("Categoria 3");
        }
        
        imprimir("Acabou o programa");
    }
}
