package br.com.letscode.introducao;

import java.util.Scanner;

public class ExercicioLista3 {

    /**
     * Escreva um programa que converte temperaturas de Celsius para Farenheit.
     * (0 °C × 9/5) + 32 = 32 °F
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double temperaturaCelcius;
        double resultado;

        System.out.print("Digite a temperatura em Celsius: ");
        temperaturaCelcius = entrada.nextDouble();

        resultado = (temperaturaCelcius * 9.0 / 5) + 32;

        System.out.printf("O valor que representa %.2f é %.2f", temperaturaCelcius, resultado);

        entrada.close();

    }
}
