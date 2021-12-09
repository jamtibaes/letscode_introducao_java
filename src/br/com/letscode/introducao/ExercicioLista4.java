package br.com.letscode.introducao;

import java.util.Scanner;

public class ExercicioLista4 {
    /**
     * Escreva um programa que recebe a cotação do dólar do dia e, seguida recebe um valor em reais.
     * A saída é a quantia em dólares.
     * Use formatação de saída para exibir os valores de acordo com cada representação de moeda.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valorDolar;
        double valorReais;

        System.out.print("Digite o valor do U$ dolar do dia: (ex. 5,23): ");
        valorDolar = entrada.nextDouble();

        System.out.print("Digite o valor em R$ reais : (ex. 10,50): ");
        valorReais = entrada.nextDouble();

        System.out.printf("No dolar de hoje U$ %.2f o montante de R$ %.2f em dolar representa U$ %.2f",valorDolar, valorReais, valorReais/valorDolar);

        entrada.close();
    }
}
