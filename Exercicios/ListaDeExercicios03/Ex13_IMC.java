package Exercicios.ListaDeExercicios03;

import java.util.Scanner;

public class Ex13_IMC {
     public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static String lerTexto() {
        String texto;
        texto = tecladoScanner.nextLine(); 
        return texto;
    }

    public static double lerValorReal() {
        double valor;
        valor = tecladoScanner.nextDouble(); 
        return valor;
    }

    public static double caclucularIMC(double peso, double altura) {
        double resultado;
        resultado = peso / Math.pow(altura, 2);
        return resultado;
    }

    /*13. Algoritmo IMC – Elabore um algoritmo em fluxograma para calcular o IMC de uma pessoa
    e mostre a sua classificação.

    IMC = Peso(Kg) / Altura2(m)

    Realizar o cálculo, verificar e dizer a classificação.
    IMC Classificação
    <18.5 Abaixo do peso
    18.6 - 24.9 Peso ideal
    25 -29.9 Peso em excesso
    30 - 34.9 Obesidade Grau I
    35 - 39.9 Obesidade Grau II (severa)
    >= 40 Obesidade Grau III (mórbida) */

    public static void main(String[] args) {
        double altura = 0;
        double peso = 0;
        double imc = 0;
        String classificacaoImc = null;

        imprimir("Digite o peso:");
        peso = lerValorReal();

        imprimir("Digite a altura:");
        altura = lerValorReal();

        imc = caclucularIMC(peso, altura);

        if (imc < 18.5) {
            classificacaoImc = "Abaixo do peso";
        } else if (imc < 25) {
            classificacaoImc = "Peso ideal";
        }else if (imc < 30) {
            classificacaoImc = "Peso em excesso";
        }else if (imc < 35) {
            classificacaoImc = "Obesidade grau I";
        }else if (imc < 40) {
            classificacaoImc = "Obesidade grau II";
        }else if (imc < 45) {
            classificacaoImc = "Obesidade grau III ou mórbida";
        }

        imprimir("O seu IMC é de: " + imc + ". " + classificacaoImc);
        }
}

