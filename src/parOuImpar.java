import java.util.InputMismatchException;
import java.util.Scanner;

public class parOuImpar {
    public static void main(String[] args) {

        int numero, par;
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        String querContinuar = "S";
        try {
            while (querContinuar.equals("S")) {
                System.out.print("Digite o número a ser averiguado:");
                numero = scan.nextInt();
                System.out.println((numero % 2 == 0) ? "O numero é par" : "O numero é impar"); // operador Ternário
                System.out.println("Você deseja averiguar outro número? Digite S para sim ou N para não.");
                querContinuar = scan2.nextLine();
                while (!querContinuar.equals("S") && !querContinuar.equals("N")){
                    System.out.println("Não entendemos sua solicitação. Por favor, responda novamente:");
                    System.out.println("Você deseja averiguar outro número? Digite S para sim ou N para não.");
                    querContinuar = scan2.nextLine();
                }
            }
        }catch(InputMismatchException e){
            System.out.println("O número que você digitou não é um número inteiro. Tente novamente.");
            main(null);
        }
    }

}
