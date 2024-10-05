import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Qual sua nota para o filme:");
        double notaFilme = leitura.nextDouble();


        System.out.println("filme favorito:" + filme);
        System.out.println("Ano de lançamento do filme:" + anoDeLancamento);

        System.out.println("Nota do filme:" + notaFilme);

    }
}
