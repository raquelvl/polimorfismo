package refeicao;

public class MistoQuente extends AlmocoPortatil {
    private Pao pao;
    private Queijo queijo;
    private Presunto presunto;

    public MistoQuente() {
        pao = new Pao();
        queijo = new Queijo();
        presunto = new Presunto();
        System.out.println("MistoQuente()");
    }

    public static void main(String[] args) {
        new MistoQuente();
    }
}
