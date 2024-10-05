import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Qual sua nota para o filme ou -1 para encerrar:");
            nota = leitura.nextDouble();
            media += nota;
            if (nota != -1){
                totalDeNotas ++;
            }


        }
        System.out.println("Media de avaliação" + media/totalDeNotas);
    }
}
