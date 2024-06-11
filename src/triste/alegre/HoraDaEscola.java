package triste.alegre;

/**
 * Exemplo de composição e herança com mudança do atributo em tempo de execução
 * e chamadas polimórficas.
 *
 * @author raquel
 *
 */
public class HoraDaEscola {

    public static void main(String[] args) {
        Mae mae = new Mae();
        mae.manda();
        mae.mudaHumorDeFilho();
        mae.manda();
    }
}
