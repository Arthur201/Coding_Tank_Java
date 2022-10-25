import java.util.Scanner;
public class MatrizQuadrada1 {
    public static void main(String[] args) {

    int n;
    int Matriz[][];
    Scanner scan = new Scanner(System.in);
    n = scan.nextInt();
    while(n !=0){
           Matriz = new int[n][n];
           for (int i = 0; i < Matriz.length; i++) {
               for (int j = 0; j < Matriz[i].length; j++) {
                   Matriz[i][j] = i;
                   System.out.print(Matriz[i][j] + " ");
           }
               System.out.print("\n");
       }
        n = scan.nextInt();


        }
    }
}
