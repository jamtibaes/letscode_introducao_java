package br.com.letscode.introducao;

import java.util.Locale;

public class TiposPrimitivos {

    static boolean variavel;

    public static void main(String[] args) {

        String nome = "José";
        var sobrenome = "Antonio";
        int idade= 40;

        String frase1 = "O " + nome + " " + sobrenome + " tem " + idade + " anos de idade";
        System.out.println(frase1);

        String frase2 = String.format("o %s %s tem %d anos de idade", nome, sobrenome, idade);
        System.out.println(frase2);

        System.out.println(frase2.equals(frase1));
        System.out.println(frase2.equalsIgnoreCase(frase1));
        System.out.println(frase1.toUpperCase());

        System.out.println(frase1.indexOf("anos"));
        System.out.println(frase1.substring(frase1.indexOf("anos")));

        double raio = 1;
        final double constante = 1;
        raio = 2;

        System.out.println(Math.PI);

    }
}
