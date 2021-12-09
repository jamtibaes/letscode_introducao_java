package br.com.letscode.introducao;

import java.util.Scanner;

public class ExercicioLista1 {
    /**
     *
     * Escreva um programa que recebe dois números inteiros e informa o resultado das operações soma, subtração, multiplicação e divisão.
     * Considere sempre a ordem em que foram informados.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int primeiraEntrada = 0;
        int segundaEntrada = 0;
        double resultado = 0;
        String operacao = "";

        System.out.print("Digite a operação desejada (+ - / *): ");
        operacao = entrada.next();

        System.out.print("Digite o primeiro valor: ");
        primeiraEntrada = entrada.nextInt();

        System.out.print("Digite o segundo valor: ");
        segundaEntrada = entrada.nextInt();

        switch (operacao) {
            case "+":
                resultado = primeiraEntrada + segundaEntrada;
                break;
            case "-":
                resultado = primeiraEntrada - segundaEntrada;
                break;
            case "/":
                if (segundaEntrada == 0) {
                    System.out.println("Operação não é possível");
                    break;
                }
                resultado = (double) primeiraEntrada / segundaEntrada;
                break;
            case "*":
                resultado = primeiraEntrada * segundaEntrada;
                break;
            default:
                System.out.println("Operação não reconhecido!");
        }

        System.out.printf("O resultado da operação é: %.4f", resultado);

        entrada.close();
    }
}
