import java.util.Scanner;
public class Consumo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // declara e constroe o vetor
        double[] consumos = new double[5];
        // popula o vetor
        for (int i = 0; i < consumos.length; i++) {
            System.out.printf("Consumo #%d: ", i + 1);
            consumos[i] = entrada.nextDouble();
        }
        // percorre o vetor
        int qtde = 0;
        for (int i = 0; i < consumos.length; i++) {
            if (consumos[i] > 5000) {
                System.out.printf("Consumo #%d - Anomalo.\n", i + 1);
                qtde++;
            }
        }
        System.out.printf("Quantidade de consumos anomalos: %d\n", qtde);

    }
}