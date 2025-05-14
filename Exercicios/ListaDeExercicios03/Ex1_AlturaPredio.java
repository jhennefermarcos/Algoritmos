package Exercicios.ListaDeExercicios03;


public class Ex1_AlturaPredio {


    //método que recebe um texto e imprime na tela
    public static void imprimir(String texto) {
      System.out.println(texto);
    }
   
   
   /*
   Algoritmo prédio – Elaborar um algoritmo em fluxograma que leia a altura
   dos andares de um prédio e o número de andares, calcule e imprima a altura
   do prédio. 
   */ 
   public static void main(String[] args) {
      double alturaAndar;
      int qntAndar;
      double alturaPredio;
      String saida;
   
   
      //entrada
      alturaAndar=3.1;
      qntAndar=3;
      //processsamento
      alturaPredio=alturaAndar*qntAndar;
      //saida
      saida="A altura do prédio é "+ alturaPredio;
      imprimir(saida);
   }
}
   