package br.com.letscode.introducao;

import java.util.Scanner;

public class ArrayExemplo {

    private int[] turmas = {810, 811};

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetor = new int[2];
        vetor[0] = 1;
        vetor[1] = 2;

        int[] valores = new int[]{1, 2, 3};

        System.out.println(vetor[0]);
        System.out.println(vetor[1]);

        //Usar o fori no atalho
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        //Usar iter no atalho
        for (double v : vetor) {
            System.out.println(v);
        }

        entrada.close();
    }
}
