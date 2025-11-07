public class FuncionarioComissionado extends Funcionario {
    private double percentual;
    private double totalVendas;

    public FuncionarioComissionado(String nome, double salario,
        double percentual, double totalVendas) {
        super(nome, salario);
        this.percentual = percentual;
        this.totalVendas = totalVendas;
    }

    @Override
    public double calcularProventos() {
        return salario + (totalVendas * percentual / 100);
    }
}
