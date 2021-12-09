package br.com.letscode.introducao;

import java.util.Scanner;

public class ExercicioLista2 {
    /**
     * Escreva um programa que informa a tabuada de um número informado (entre 1-10).
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tabuada;

        System.out.print("Digite um valor para a tabuada (1-10): ");
        tabuada = entrada.nextInt();

        if(tabuada > 0 && tabuada < 11) {
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", i, tabuada, i*tabuada);
            }
        } else {
            System.out.println("Erro - Fora dos limites");
        }

        entrada.close();

    }
}
