package exemplo.afinador;

import java.util.Objects;

public class Som {
    private Instrumento instrumento;
    private Nota nota;

    public Som(Instrumento instrumento, Nota nota) {
        this.instrumento = instrumento;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Som{" +
                "instrumento=" + instrumento +
                ", nota=" + nota +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Som som)) return false;

        if (!Objects.equals(instrumento, som.instrumento)) return false;
        return nota == som.nota;
    }

    @Override
    public int hashCode() {
        int result = instrumento != null ? instrumento.hashCode() : 0;
        result = 31 * result + (nota != null ? nota.hashCode() : 0);
        return result;
    }
}
