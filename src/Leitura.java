import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura =  new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();

        System.out.println("Qual ano de lancamento?");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Qual sua avalicao pro filme?");
        double avalicao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avalicao);
    }
}
