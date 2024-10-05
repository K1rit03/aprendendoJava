public class Main {
    public static void main(String[] args) {
        System.out.println("Cyber Teather");
        System.out.println("Ted 2");

        int ano = 2015;
        System.out.println("Ano de lançamento: " + ano);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.2;

        double media = (10 + 6.3 + 5.8) / 3;
        System.out.println(media);

        String sinopse = """
                Quando criança, John desejou que seu ursinho Ted ganhasse vida e, \
                surpreendentemente, foi atendido. Porém, agora que é adulto, ele precisa \
                lidar com as consequências de seu pedido, já que Ted não vai parar de \
                atormentar a sua vida.
                """;
        System.out.println(sinopse);

        int classificacao = (int) (media/2);
        System.out.println(classificacao);
    }
}
