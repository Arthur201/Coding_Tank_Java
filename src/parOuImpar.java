import java.util.InputMismatchException;
import java.util.Scanner;

public class parOuImpar {
    public static void main(String[] args) {

        int numero, par;
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        String querContinuar = "S";
        try {
            while (querAveriguar(querContinuar)) {
                System.out.print("Digite o número a ser averiguado:");
                numero = scan.nextInt();
                System.out.println((numero % 2 == 0) ? "O numero é par" : "O numero é impar"); // operador Ternário
                perguntaAveriguacao();
                querAveriguar(querContinuar);
            }
        } catch (InputMismatchException e) {
            System.out.println("O número que você digitou não é um número inteiro. Tente novamente.");
            main(null);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            querAveriguar(querContinuar);
        }
    }
    public static void respostaValida(String resposta){
        if(!resposta.equals("S") && !resposta.equals("N")){
            System.out.println("Não entendemos sua solicitação. Por favor, digite novamente.");
            perguntaAveriguacao();
        }
    }

    public static boolean querAveriguar(String resposta) {
        if (resposta.equals("S")) {
            return true;
        } else {
            return false;
        }

    }

    public static void perguntaAveriguacao() {
        System.out.println("Você deseja averiguar outro número? Digite S para sim ou N para não.");
        Scanner scan2 = new Scanner(System.in);
        String querContinuar = scan2.nextLine();
        respostaValida(querContinuar);
        if(querContinuar.equals("N")){
            System.exit(0);
        }
    }

}
