public class Programa {
    public static void main(String[] args) {
        Contribuintes vitimas = new Contribuintes();

        vitimas.adicionaContribuinte(new PessoaFisica("Ale", 1000));
        vitimas.adicionaContribuinte(new PessoaJuridica("XYZ Ltda.", 15000));
        vitimas.adicionaContribuinte(new PessoaFisica("Mignon", 12000));

        vitimas.apresentaContribuintes();
    }
    
}
