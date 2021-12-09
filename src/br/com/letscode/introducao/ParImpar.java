package br.com.letscode.introducao;

public class ParImpar {

    public static void main(String[] args) {
        System.out.println((Float.parseFloat(args[0]) % 2) == 0 ? "Par"  : "Impar");
    }

}
