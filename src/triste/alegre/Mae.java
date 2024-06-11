package triste.alegre;

public class Mae {

    private Filho filho = new FilhoContente();
    private boolean contente = true;

    public void mudaHumorDeFilho() {
        if (contente) {
            filho = new FilhoChateado();
            contente = false;
        } else {
            filho = new FilhoContente();
            contente = true;
        }
    }
    public void manda() {
        filho.obedece();// chamada polimórfica
    }
}
