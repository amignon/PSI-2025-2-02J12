
public class Programa {
    public static void main(String[] args) {
        FolhaPagamento fp = new FolhaPagamento();
        fp.adicionarFuncionario(new Funcionario("Ale", 1000));
        fp.adicionarFuncionario(new FuncionarioComissionado("Mignon", 1000, 7.5, 15000));
        fp.adicionarFuncionario(new FuncionarioProdutividade("Alex", 1000, 1.50, 600));
        fp.listarFuncionarios();
    }
}
