package Exercicios.ListaDeExercicios03;

import java.util.Scanner;

public class Ex11_NotaConceito {

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
/*11. Algoritmo conceito - Elaborar um algoritmo em fluxograma que leia o nome do aluno, as 3
notas obtidas por esse aluno e calcule a média de aproveitamento, usando a fórmula:
mediaFinal =(nota1 ∗ 2 + nota2 ∗ 3 + nota3 ∗ 5)/10
O algoritmo deve escrever o nome do aluno, o conceito correspondente e a mensagem ’Aprovado’
se o conceito for A, B ou C, e ’Reprovado’ se o conceito for D ou E. A atribuição dos conceitos
obedece a tabela abaixo. */
    public static void main(String[] args) {
        String nomeAluno = null;
        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;
        double mediaFinal = 0;
        char conceito = ' ';

        imprimir("Digite seu nome");
        nomeAluno = lerTexto();

        imprimir("Digite a nota 1:");
        nota1 = lerValorReal();

        imprimir("Digite a nota 2:");
        nota2 = lerValorReal();  
        
        imprimir("Digite a nota 3:");
        nota3 = lerValorReal();
        
        mediaFinal = ((nota1*2)+(nota2*3)+(nota3*5))/10;

        if (mediaFinal >=90) { 
            conceito = 'A';            
        }else if (mediaFinal >=75) {
            conceito = 'B';            
        }else if (mediaFinal >=60) {
            conceito = 'C';
        }else if (mediaFinal >=40) {
            conceito = 'D'; 
        }else{
            conceito = 'E';
        }
        
        if (conceito == 'D' || conceito == 'E') {
            imprimir("Aluno:"+nomeAluno+". Conceito: "+conceito+". Status: Reprovado!");
        }else{
            imprimir("Aluno:"+nomeAluno+". Conceito:"+conceito+". Status: Aprovado!");
        }
    }
}