public class primeiraClasse {
    public  static void main(String[] args){
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick" );

        int ano = 2022;
        System.out.println("ano de lancamento: "+ ano);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.9 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                Filme: Top Gun: Maverick
                Filme de aventura com galã dos anos 80
                muito bom!
                Ano de lancamento: 
                """ + ano;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) media/2;
        System.out.println(classificacao);
    }
}
