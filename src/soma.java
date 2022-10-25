import java.util.Scanner;

public class soma {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int num1,num2;

        System.out.println("Digite dois numeros: ");
        num1 = Integer.parseInt(scan.nextLine());
        num2 = Integer.parseInt(scan.nextLine());

        int soma = num1+num2;

        System.out.println("SOMA = " + soma);

    }
}
