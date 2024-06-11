package refeicao.preparada;

public class Refeicao {
    public Refeicao() {
        System.out.println("Refeicao() antes do preparo");
        prepara();
        System.out.println("Refeicao() depois do preparo");
    }

    public void prepara() {
        System.out.println("Prepara Refeicao");
    }
}
