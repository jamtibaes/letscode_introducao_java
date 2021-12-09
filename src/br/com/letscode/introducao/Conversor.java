package br.com.letscode.introducao;

public class Conversor {

    /*
    fahrenheit = (celsius * fator1) + fator2
    fator1 = 9 / 5
    fator2 = 32
     */

    public static void main(String[] args) {
        double C = 2;
        double F = (C * 9.0 / 5) + 32;

        System.out.println(F);
    }
}
