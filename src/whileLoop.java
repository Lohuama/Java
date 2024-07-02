import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while ( nota != -1){
            System.out.println("Digite sua avaliacao ou -1 pra encerrar: ");
            nota = leitura.nextDouble();

            if (nota != -1){
                mediaAvaliacao += nota;
                totalDeNotas++;
            }

        }

        System.out.println("media = " + mediaAvaliacao / totalDeNotas);
    }
}
