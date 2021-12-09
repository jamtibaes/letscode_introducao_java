package br.com.letscode.introducao;

import java.util.Scanner;

public class ExercicioLista5 {


    /**
     * Escreva um programa que realiza conversão de medidas de polegadas em centímetros.
     */

    public static final double VALOR_CONVERSAO_CENTIMETROS = 2.54;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valorPolegadas;

        System.out.print("Digite a valor em polegadas: (ex. 3,56): ");
        valorPolegadas = entrada.nextDouble();

        System.out.printf("O valor de %.2f polegada(s) é igual a %.4f", valorPolegadas, valorPolegadas * VALOR_CONVERSAO_CENTIMETROS);

        entrada.close();
    }
}
