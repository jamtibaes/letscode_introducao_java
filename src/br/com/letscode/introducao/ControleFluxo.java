package br.com.letscode.introducao;

public class ControleFluxo {

    public static void main(String[] args) {



        //int b = (int) (Math.random() * 10);
        int b = args.length;

        if(b < 3){
            System.out.println("baixo " + b);
        }

        else if(b > 6){
            System.out.println("alto " + b);
        }

        else if(b % 2 == 0){
            System.out.println("par " + b);
        }

    }
}
