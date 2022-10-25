import java.util.Scanner;

public class uri1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("Digite um número por favor: ");
        num1 = Integer.parseInt(scan.nextLine());
        System.out.println("Digite mais um número, para fazermos a soma: ");
        num2 = Integer.parseInt(scan.nextLine());

        int soma = num1 + num2;

        System.out.println("A soma dos dois números é: " + soma);
    }
}
