package br.com.letscode.introducao;

import java.util.Scanner;

public class RepeticaoWhileFor {
    public static void main(String[] args) {
        // While Deteminado
        int i = 1;
        while(i <= 10) {
            System.out.println(i);
            i += 2;
        }

        // While Indeterminado
        Scanner entrada = new Scanner(System.in);
        String text = "n";
        String texto = "";

        while (!text.equalsIgnoreCase("S")) {
            System.out.println("Deseja finalizar o programa 1? (s/n)");
            text = entrada.next();
        }

        do{
            System.out.println("Deseja finalizar o programa 2? (s/n)");
            texto = entrada.next();
        } while(!texto.equalsIgnoreCase("S"));

        entrada.close();

        for(int a = 1; a < 10; a += 2){
            System.out.println(a);
        }

    }
}
