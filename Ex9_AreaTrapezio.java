import java.util.Scanner;


public class Ex9_AreaTrapezio {
  
   public static Scanner tecladoScanner = new Scanner(System.in);       


   //método que recebe um texto e imprime na tela
   public static void imprimir(String texto) {
       System.out.println(texto);
   }


   public static double lerValorReal (){
       double valor;
       valor = tecladoScanner.nextDouble();
       return valor;
   }


   public static int lerValorInteiro (){
       int valor;
       valor = tecladoScanner.nextInt();
       return valor;
   }


   public static double calcularAreaTrapezio (double baseMenor, double baseMaior, double altura){
       double resultado;
       resultado = ((baseMaior*baseMenor)*altura)/2;
       return resultado;
   }


   /*Algoritmo trapézio – Elabore um algoritmo em fluxograma para calcular a área de um
   trapézio. Sabe-se que:
   areatrapezio =(baseMaior + baseMenor) ∗ altura/2
   Lembre-se a altura, a base maior e a base menor devem ser números maiores que zero. Se o
   usuário digitar algo inválido informar do erro. */

    //variáveis
    public static void main(String[] args) {
    double baseMenor;
    double baseMaior;
    double altura;
    double areaTrapezio;
    String saida;

    // entrada
    imprimir("Informe a base menor do trapézio");
    baseMenor = lerValorReal();

    imprimir("Informe a base maior do trapézio");
    baseMaior = lerValorReal();

    imprimir("Informe a altura do trapézio");
    altura = lerValorReal();

    //processamento 
    areaTrapezio = calcularAreaTrapezio (baseMenor, baseMaior, altura);

    //saida
    saida = "A área do trapézio é "+ areaTrapezio;
    imprimir(saida);
    
    }

}    

