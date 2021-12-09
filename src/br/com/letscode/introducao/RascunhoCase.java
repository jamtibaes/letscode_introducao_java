package br.com.letscode.introducao;

import java.time.DayOfWeek;
import java.util.Random;

public class RascunhoCase
{
    public static void main(String[] args) {

        int b = new Random().nextInt(7);
        agenda(15);
        agenda(DayOfWeek.of(b));
        agenda(DayOfWeek.WEDNESDAY);


    }
    private static void agenda(int b) {
        switch (b){
            case 1:
            case 2:
            case 3:
                System.out.println("Aula");
                break;
            case 4:
            case 5:
                System.out.println("Estudar");
                break;
            case 6:
            default:
                System.out.println("Descansar");
        }
    }

    private static void agenda(DayOfWeek dia) {
        switch (dia){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
                System.out.println("Aula");
                break;
            case THURSDAY:
            case FRIDAY:
                System.out.println("Estudar");
                break;
            case SATURDAY:
            default:
                System.out.println("Descansar");
        }
    }
}
