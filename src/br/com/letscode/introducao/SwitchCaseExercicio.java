package br.com.letscode.introducao;

import java.util.Scanner;

public class SwitchCaseExercicio {
    /**
     * Realizar uma operação matemática, que deve ser passada via System.in ( opções: + - / * )
     * entre dois números que também devem ser solicitados via System.in
     *
     * @param args
     */
    public static void main(String[] args) {

        String operador;
        double primeiroNumero;
        double segundoNumero;
        double resultado = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Escolha um operação entre + - / *: ");
        operador = input.next();

        System.out.print("Digite o primeiro número: ");
        primeiroNumero = input.nextInt();

        System.out.print("Digite o segundo número: ");
        segundoNumero = input.nextInt();

        switch (operador) {
            case "+" :
                resultado = primeiroNumero + segundoNumero;
                break;
            case "-":
                resultado = primeiroNumero - segundoNumero;
                break;
            case "/":
                resultado = primeiroNumero / segundoNumero;
                break;
            case "*":
                resultado = primeiroNumero * segundoNumero;
                break;
            default:
                System.out.println("Operador não encontrado");
        }

        System.out.printf("O resultado de %f %s %f é: %f",primeiroNumero, operador, segundoNumero, resultado);


        input.close();


    }
}
