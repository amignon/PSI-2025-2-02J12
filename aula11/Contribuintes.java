import java.util.ArrayList;

public class Contribuintes {
    private ArrayList<Contribuinte> constribuintes;    

    public Contribuintes() {
        constribuintes = new ArrayList<>();
    }

    public void adicionaContribuinte(Contribuinte c) {
        constribuintes.add(c);
    }

    public void apresentaContribuintes() {
        /* 
        for (Contribuinte c : constribuintes) {
            double imposto = c.calculaImposto();
            String dados = String.format("%-10s Renda: R$ %8.2f Imposto: R$ %8.2f", 
            c.getNome(), c.getRenda(), imposto);
            System.out.println(dados);
        }
        */
        for (Contribuinte c : constribuintes) {
            System.out.println(c);
        }
    }
}
