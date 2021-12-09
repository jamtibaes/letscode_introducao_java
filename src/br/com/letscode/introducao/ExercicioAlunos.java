package br.com.letscode.introducao;

import java.util.Scanner;

public class ExercicioAlunos {
    /**
     * Calcular a média de notas de uma turma com n alunos.
     * O valor n deve ser solicitado via System.in.
     * Deve-se criar um veto para armazenar a nota de todos os alunos.
     * Ao final o programa deve imprimir a nota média e também a quantidade de alunos.
     * Obs.: Utilize um for para obter as notas de cada aluno e um foreach para fazer o cálculo da média
     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int quantidadeAlunos = 0;
        double[] notas;
        double media = 0;

        System.out.print("Digite a quantidade de alunos: ");
        quantidadeAlunos = entrada.nextInt();

        notas = new double[quantidadeAlunos];

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Digite a nota do aluno : " + i);
            notas[i] = entrada.nextDouble();
        }

        for (double nota : notas) {
            media += nota;
        }

        media /= quantidadeAlunos;

        System.out.println("A média é: " + media);

        entrada.close();



    }
}
