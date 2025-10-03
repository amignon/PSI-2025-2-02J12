public class TestaContador {
    public static void main(String[] args) {
        Contador c1 = new Contador();
        c1.incrementa();
        System.out.printf("C1: %d\n", c1.getValor());
        Contador c2 = new Contador();
        c2.incrementa();
        c2.incrementa();
        c1.zera();
        System.out.printf("C1: %d\n", c1.getValor());
        System.out.printf("C2: %d\n", c2.getValor());

    }
    
}
