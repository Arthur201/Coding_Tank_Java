import java.util.Scanner;
public class conversaoTemperatura {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final double FATOR1 = 9.0/5.0;
        final int FATOR2 = 32;
        Integer Celsius;
        int contador = 0;
        Double Farenheit;


        while(contador < 2 ) {
            System.out.println("Digite a temperatura em graus Celsius a ser convertida: ");
            Celsius = scan.nextInt(); // método para selecionar os inteiros
            Farenheit = (Celsius*FATOR1)+FATOR2;
            System.out.println("A temperatura correspondente em Farenheit é: " + Farenheit);
            contador++;
        }

        System.out.println("Você chegou ao limite de conversões de temperatura por hoje!");








    }



}
