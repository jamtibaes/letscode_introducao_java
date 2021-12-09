package br.com.letscode.introducao;

public class Introducao {
    public static void main(String[] args) {

        // Autoboxing
        Integer wraper = 9;
        System.out.println(wraper);

        // Unboxing
        int unb = 12;
        System.out.println(unb);

        unb = wraper;
        System.out.println(unb);

        Integer first = 1;
        Integer second = 1;

        System.out.println(first == second);
        System.out.println(first.compareTo(second) == 0);

        System.out.println(first.compareTo(1) == 0);
        System.out.println(first.compareTo(2) == 0);

        String number = "1";
        System.out.println(first.compareTo(Integer.parseInt(number)) == 0);


        int i = 0;
        System.out.println("0 == " + i);
        System.out.println(i++ == 1 ? "1 == " + i: "1 != " + i);
        System.out.println(++i == 2 ? "2 == " + i: "2 != " + i);


    }
}
