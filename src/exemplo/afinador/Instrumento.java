package exemplo.afinador;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public abstract class Instrumento {
    private String nome;

    public Instrumento(String nome) {
        super();
        this.nome = nome;
    }

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Instrumento [nome=" + nome + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Instrumento that)) return false;

        return getNome() != null ? getNome().equals(that.getNome()) : that.getNome() == null;
    }

    @Override
    public int hashCode() {
        return getNome() != null ? getNome().hashCode() : 0;
    }
}
