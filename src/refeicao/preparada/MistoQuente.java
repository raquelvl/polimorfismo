package refeicao.preparada;

import refeicao.Pao;
import refeicao.Presunto;
import refeicao.Queijo;

public class MistoQuente extends AlmocoPortatil {

    private Pao pao;
    private Queijo queijo;
    private Presunto presunto;

    public MistoQuente() {
        pao = new Pao();
        queijo = new Queijo();
        presunto = new Presunto();
        System.out.println("MistoQuente() antes do preparo");
        prepara();
        System.out.println("MistoQuente() depois do preparo");
    }

    public void prepara() {
        System.out.println("Prepara MistoQuente");
    }

    public static void main(String[] args) {
        new MistoQuente();
    }
}
