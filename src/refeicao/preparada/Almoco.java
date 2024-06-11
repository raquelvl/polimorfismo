package refeicao.preparada;

public class Almoco extends Refeicao {

    public Almoco() {
        System.out.println("Almoco() antes do preparo");
        prepara();
        System.out.println("Almoco() depois do preparo");
    }

    public void prepara() {
        System.out.println("Prepara Almoco");
    }
}
