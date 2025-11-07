public abstract class Contribuinte {
    private String nome;
    private double renda;
    
    public Contribuinte(String nome, double renda) {
        this.nome = nome;
        this.renda = renda;
    }

    public abstract double calculaImposto();

    public String getNome() {
        return nome;
    }

    public double getRenda() {
        return renda;
    }

    @Override
    public String toString() {
        return String.format("%-10s Renda: R$ %8.2f Imposto: R$ %8.2f", 
            nome, renda, calculaImposto());
    }
}
