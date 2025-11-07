import java.util.ArrayList;

public class FolhaPagamento {
    private ArrayList<Funcionario> funcionarios;

    public FolhaPagamento() {
        funcionarios = new ArrayList<Funcionario>();
    }

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public void listarFuncionarios() {
        System.out.println("*** Lista de Funcionários ***");
        for (Funcionario f : funcionarios) {
            double proventos = f.calcularProventos();
            System.out.printf("%-10s| R$ %5.2f\n", f.getNome(), proventos);
        }
    }
}
