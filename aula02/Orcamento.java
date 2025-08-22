import java.util.Scanner;

public class Orcamento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Serviço: ");
        String servico = entrada.nextLine();
        System.out.print("Horas: ");
        int horas = entrada.nextInt();
        System.out.print("Valor por hora: ");
        double valorHora = entrada.nextDouble();
        entrada.nextLine();
        System.out.print("Nome do cliente: ");
        String cliente = entrada.nextLine();

        double custo = horas * valorHora;

        String linha = "=".repeat(40);
        System.out.println(linha);
        System.out.printf("%10sORCAMENTO DE SERVICO\n", "");
        System.out.println(linha);
        System.out.printf("Cliente: %s\n", cliente);
        System.out.printf("Serviço: %s\n", servico);
        System.out.printf("Horas Estimadas: %d\n", horas);
        System.out.printf("Valor por hora: R$ %.2f\n", valorHora);
        System.out.printf("-".repeat(40));
        System.out.printf("\nCusto total: R$ %.2f\n", custo);
        System.out.println(linha);
        System.out.println("Validade deste orçamento: 7 dias.");
        System.out.println("Obrigado pela preferência!");
        System.out.println(linha);
    }
}