public class Condicional {
    public static void main(String[] args) {
        int ano = 2015;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.2;
        String tipoPlano = "normal";

        if (ano >= 2022){
            System.out.println("Lançamentos que ja chegaram com tudo");
        }else{
            System.out.println("Classicos que nos amamos");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")){
            System.out.println("Filme Liberado");
        }else{
            System.out.println("Aluguel do filme pendente");
        }
    }
}
