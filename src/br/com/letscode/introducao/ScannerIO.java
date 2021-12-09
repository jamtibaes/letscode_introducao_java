package br.com.letscode.introducao;

import java.util.Scanner;

public class ScannerIO {
    public static void main(String[] args) {

/*        int primeiro;
        int segundo;

        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.println("Digite primeiro número: ");
        primeiro = input1.nextInt();

        System.out.println("Digite segundo número: ");
        segundo = input2.nextInt();

        System.out.printf("A soma dos dois números é: %d", primeiro + segundo);*/



        int primeiro = 0;
        int segundo = 0;

        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        if(args.length == 0){
            System.out.println("Digite primeiro número: ");
            primeiro = input1.nextInt();
            System.out.println("Digite segundo número: ");
            segundo = input2.nextInt();
        }
        else if(args.length == 1 ){
            primeiro = Integer.parseInt(args[0]);
            System.out.println("Digite segundo número: ");
            segundo = input2.nextInt();
        }
        else if(args.length == 2 ){
            primeiro = Integer.parseInt(args[0]);
            segundo = Integer.parseInt(args[1]);
        }

        if(args.length > 2 ) {
            System.err.println("Muitos Parametros");

        } else {
            System.out.println(primeiro + segundo);
        }

        //var valor1 = Integer.parseInt(args[0]);
        //var valor2 = Integer.parseInt(args[1]);



    }
}
