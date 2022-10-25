public class Aprovado {
    public static void main(String[] args) {

        double nota1, nota2, nota3, nota4, media;

        nota1 = Double.parseDouble(args[0]);
        nota2 = Double.parseDouble(args[1]);
        nota3 = Double.parseDouble(args[2]);
        nota4 = Double.parseDouble(args[3]);

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println(media);
        System.out.println((media >= 6) ? "Aprovado" : "Reprovado");

    }
}
