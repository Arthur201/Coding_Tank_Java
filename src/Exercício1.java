public class Exercício1 {
    public static void main(String[] args) {

        int numero;
        numero = Integer.parseInt(args[0]);
        System.out.println((numero % 2 == 0)? "O numero digitado eh par" : "O numero digitado eh impar");

    }
}