package refeicao.preparada;

public class AlmocoPortatil extends Almoco {

    public AlmocoPortatil() {
        System.out.println("AlmocoPortatil() antes do preparo");
        prepara();
        System.out.println("AlmocoPortatil() depois do preparo");
    }

    public void prepara() {
        System.out.println("Prepara AlmocoPortatil");
    }
}
