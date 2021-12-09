package br.com.letscode.introducao;

import java.util.Scanner;

public class RepeticaoExercicio {
        /**
         * Calcule a média aritmética de n valores a serem digitados.
         *
         * Seu programa deve pedir para que o usuário digite uma nota de 0 a 10.
         *
         * Se o valor digitado for -1, seu programa deve efetuar o cálculo da média e imprimir na tela,
         * com a quantidade de notas digitadas
         *
         * Se for maior que 10, deve devolver uma mensagem avisando que a nota está inválida
         * e não adicionar na soma.
         */

    public static void main(String[] args) {

        boolean parada = false;
        int interacoes = 0;
        int valor = 0;
        double resultado = 0;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("Digite uma nota entre 0 a 10: ");
            valor = entrada.nextInt();
            if(valor == -1) {
                parada = true;
            } else if(valor > 10) {
                System.out.println("Nota inválida!");
            } else {
                resultado += valor;
                interacoes++;
            }
        } while(!parada);

        if(interacoes > 0){
            System.out.printf("Foram realizadas %d interações com o total de %.2f e a média ficou em %.2f",
                interacoes, resultado, resultado / interacoes);
        } else {
            System.out.println("Não foi possível calcular!");
        }

        entrada.close();

    }
}
