package br.com.letscode.introducao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ExemploIO {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("pt", "br"));

        // https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html
        // https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html#dt

        /**
         * Criar um programa que utilizando a data e hora atual ( LocalDateTime.now() ) que imprima:
         * Numero do dia, com 2 caracteres sempre, ex: 01, o nome sem abreviação do mês e o ano com apenas 2 digitos
         */

        LocalDateTime date = LocalDateTime.now();
        System.out.printf("%td/%tB/%ty %n", date, date, date);
        System.out.printf("%1$td/%1$tB/%1$ty %n", date);
        System.err.println("Deu Ruim");



        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yy");
        System.out.printf("%s%n", formatter.format(date));
    }
}
