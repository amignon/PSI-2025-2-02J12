public class PessoaJuridica extends Contribuinte {

    public PessoaJuridica(String nome, double renda) {
        super(nome, renda);
    }

    @Override
    public double calculaImposto() {
        return this.getRenda() * 0.10;
    }
}
