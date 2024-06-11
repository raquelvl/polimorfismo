package exemplo.afinador;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Piano extends Instrumento {
    public static final String NOME = "PIANO";

    public Piano(String nome) {
        super(NOME);
    }

    // os métodos toca de todas as subclasses de instrumento são iguais aqui só porque
    // é um exemplo simples, para fins didáticos. Na realidade, tocar esses instrumentos
    // é bem diferente! Vamos usar a imaginação eheh
    public Som toca(Nota n) {
        return new Som(this, n);
    }

    public List<Som> toca(int numNotas) {
        List<Som> sons = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i < numNotas; i++) {
            int nota = rand.nextInt(Nota.values().length);
            sons.add(new Som(this, Nota.values()[nota]));
        }
        return sons;
    }
}
