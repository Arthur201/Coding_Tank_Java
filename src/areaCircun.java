import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
public class areaCircun {

    public static void main(String[] args) {
        double raio,area;
        final double PI = 3.14; // Constantes são sempre instanciadas em caixa alta e definidas por "final"
        Scanner scan = new Scanner(System.in);

       System.out.println("Digite o raio da circunferência: ");
       raio = scan.nextDouble();

       area = (raio*raio)*PI;

       System.out.println("A área da circunferência é: "+area);


    }
}

