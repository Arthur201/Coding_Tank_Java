import java.util.Scanner;
public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double num1,num2,multiplicacao,divisao,soma,subtracao;

        System.out.println("Escolha a operação matemática que você deseja fazer: \n M (multiplicação)\n D (divisão) \n S (soma)\n SU (subtração) ");
        String resposta = scan.nextLine();

        System.out.println("Digite os dois números a serem calculados: ");
        num1 = scan.nextDouble();
        num2 = scan.nextDouble();

        if(resposta.equals("M")){

            multiplicacao = num1*num2;
            System.out.println("O resultado da multiplicação é " + multiplicacao);

        }
        else if (resposta.equals("D")) {

            divisao = num1/num2;
            System.out.println("O resultado da divisão é " + divisao);

        }
        else if (resposta.equals("S")){

            soma = num1+num2;
            System.out.println("O resultado da soma é " + soma);

        }
        else if (resposta.equals("SU")) {

            subtracao = num1-num2;
            System.out.println("O resultado da subtração é " + subtracao);

        }



    }
}
