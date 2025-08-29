import java.util.Scanner;
public class Curtidas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroPublicacoes;
        do {
            System.out.printf("Número de publicações: ");
            numeroPublicacoes = entrada.nextInt();
            if (numeroPublicacoes <= 0) {
                System.out.println("O número de publicações deve ser um valor positivo.");
            }
        } while (numeroPublicacoes <= 0);

        int totalCurtidas = 0; // acumuladora
        for (int i = 1; i <= numeroPublicacoes; i++) {
            System.out.printf("Quantidade de curtidas #%02d: ", i);
            int qtdeCurtidas = entrada.nextInt();
            totalCurtidas += qtdeCurtidas; // totalCurtidas = totalCurtidas + qtdeCurtidas
            if (qtdeCurtidas >= 100) {
                System.out.println("\tPublicação popular!");
            }
            else {
                System.out.println("\tPublicação com poucas curtidas!");
            }
        }
        double mediaCurtidas = (double) totalCurtidas / numeroPublicacoes;
        System.out.printf("Número de publicações: %d\n", numeroPublicacoes);
        System.out.printf("Total de curtidas: %d\n", totalCurtidas);
        System.out.printf("Média de curtidas: %.2f\n", mediaCurtidas);
    }
}