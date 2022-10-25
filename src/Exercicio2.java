import java.io.InputStreamReader;

public class Exercicio2 {
    public static void main(String[] args) {

        if (args.length == 0) {

            System.out.println("Por favor, digite os dois numeros a serem somados");


        } else if (args.length == 1) {

            System.out.println("Digite o segundo numero para efetuarmos a soma");

        } else if (args.length > 2) {
            System.out.println("Voce digitou numeros demais! Digite APENAS dois numeros");


        }
        else {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);


            int soma = num1 + num2;

            System.out.println("A soma dos dois numeros eh: " + soma);
        }



    }
}
