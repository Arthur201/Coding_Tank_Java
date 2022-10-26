import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double num1, num2, multiplicacao, divisao, soma, subtracao;


        System.out.println("Escolha a operação matemática que você deseja fazer: \n M (multiplicação)\n D (divisão) \n S (soma)\n SU (subtração) ");

        String resposta = scan.nextLine();

        operacaoValida(resposta);
        while (!operacaoValida(resposta)) {

            System.out.println("A operação que você deseja fazer não foi bem compreendida. Escolha a operação matemática que você deseja fazer: \n M (multiplicação)\n D (divisão) \n S (soma)\n SU (subtração) ");

            resposta = scan.nextLine();
            operacaoValida(resposta);
        }
        try {
            scan = new Scanner(System.in);
            System.out.println("Digite os dois números a serem calculados: ");
            num1 = scan.nextDouble();
            num2 = scan.nextDouble();
            operation(resposta, num1, num2);
            System.out.println("O resultado da operação é: " + operation(resposta, num1, num2));
        } catch (InputMismatchException e) {

            System.out.println("O numero que você digitou é inválido, tente novamente.");
            main(null);  /*roda o método main novamente*/
        }
    }

    // o main termina aqui //
    public static boolean operacaoValida(String resposta) {
        if (resposta.equals("M") || resposta.equals("D") || resposta.equals("S") || resposta.equals("SU")) {
            return true;
        } else {
            return false;
        }
    }

    public static void set2Numbers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os dois números a serem calculados: ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
    }

    public static double operation(String resposta, double num1, double num2) {
        double resultado = 0.0;
        if (resposta.equals("M")) {
            double multiplicacao = num1 * num2;
            resultado = multiplicacao;
        } else if (resposta.equals("D")) {
            double divisao = num1 / num2;
            resultado = divisao;
        } else if (resposta.equals("S")) {
            double soma = num1 + num2;
            resultado = soma;
        } else if (resposta.equals("SU")) {
            double subtracao = num1 - num2;
            resultado = subtracao;
        }
        return resultado;
    }

}