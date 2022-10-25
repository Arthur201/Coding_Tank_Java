public class parOuImpar {
    public static void main(String[] args) {

        int a,par;
        a = Integer.parseInt(args[0]);
       int tamanho = args.length;
       System.out.println(tamanho);

        System.out.println((a % 2 == 0) ? "O numero e par" : "O numero e impar"); // operador Ternário
    }
}
