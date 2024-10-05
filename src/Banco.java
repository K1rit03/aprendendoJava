import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        String Nome = "Thiago";
        String tipoConta = "Salario";
        double saldoInicial = 2000;
        int opcao = 0;


        System.out.println("*****************************************");
        System.out.println("Dados Iniciais do Cliente");
        System.out.println("Nome:" + Nome);
        System.out.println("Tipo de conta:" + tipoConta);
        System.out.println("Saldo Inicial:" + saldoInicial);
        System.out.println("*****************************************");


        String Menu = """
                **Digite sua ação:
                1 - Consulatar o saldo
                2 - Transferir valor
                3 - Receber valor
                4- Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while(opcao != 4){
            System.out.println(Menu);
            opcao = leitura.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Saldo atual da conta: " + saldoInicial);

                    break;

                case 2:
                    System.out.println("Digite abaixo o valor que deseja transferir");
                    double valorTransferencia = leitura.nextDouble();
                    if (valorTransferencia > saldoInicial){
                        System.out.println("Valor insuficiente na conta");
                        break;
                    }else{
                        saldoInicial -=  valorTransferencia;
                        System.out.println("Valor trasnferido com sucesso");
                        break;

                    }

                case 3:
                    System.out.println("Digite a baixo o valor recebido");
                    double valorRecebido = leitura.nextDouble();
                    saldoInicial += valorRecebido;
                    System.out.println("Valor recebido com sucesso");
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
            }
        }



    }
}
