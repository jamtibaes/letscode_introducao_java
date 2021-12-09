package br.com.letscode.introducao;

import java.util.Scanner;

public class ExercicioTurmas {

    /**
     * Receber uma quantidade de turmas e a quantidade de alunos por turma e armazenar em uma matriz.
     * Com esses dados você deve imprimir a média de cada uma das turmas e em seguida a média de todas as turmas.
     *
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidadeTurmas = 0;
        int quantidadeAlunos = 0;

        double[][] matrizTurmasAlunos;

        double mediaGeral = 0;
        double mediaTurma = 0;

        System.out.print("Digite a quantidade de turmas: ");
        quantidadeTurmas = entrada.nextInt();

        System.out.print("Digite a quantidade de alunos: ");
        quantidadeAlunos = entrada.nextInt();

        matrizTurmasAlunos = new double[quantidadeTurmas][quantidadeAlunos];

        for (int i = 0; i < quantidadeTurmas; i++) {
            for (int j = 0; j < quantidadeAlunos; j++) {
                System.out.printf("Digite a nota do aluno %d da turma %d: ", j, i);
                matrizTurmasAlunos[i][j] = entrada.nextDouble();
            }
        }

        int n = 0;
        for (double[] turma : matrizTurmasAlunos) {
            for (double nota : turma) {
                mediaTurma += nota;
            }
            mediaGeral += mediaTurma;
            System.out.printf("Media da turma %d é: %.2f%n", n++ ,mediaTurma/quantidadeAlunos);
            mediaTurma = 0;
        }

        System.out.println("A media geral é: " + mediaGeral/(quantidadeTurmas*quantidadeAlunos));






/*        for (double[] matrizTurmasAluno : matrizTurmasAlunos) {

        }

        media /= quantidadeTurmas;

        System.out.println("A média é: " + media);
*/
        entrada.close();
    }
}
