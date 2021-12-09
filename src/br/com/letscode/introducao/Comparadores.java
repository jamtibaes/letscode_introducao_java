package br.com.letscode.introducao;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class Comparadores {
    public static void main(String[] args) {

        System.out.println("false && false = " + (false && false));
        System.out.println("false && true = " + (false && true));
        System.out.println("true && false = " + (true && false));
        System.out.println("true && true = " + (true && true));

        System.out.println("false || false = " + (false || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("true || true = " + (true || true));

        System.out.println(DayOfWeek.WEDNESDAY.getDisplayName(TextStyle.SHORT, Locale.ENGLISH));
        System.out.println(DayOfWeek.of(1));
    }
}
