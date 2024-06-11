package sem.polimorfismo;

/**
 * Exemplo que demonstra que métodos estáticos não são polimórficos.<br>
 * (Exemplo derivado de "Thinking in Java")
 * @author Raquel Lopes
 *
 */
public class StaticSuper {

    public static String STATIC_STRING = "Base Static String";

    public static String staticGet() {
        return "Base staticGet()";
    }

    public String dynamicGet() {
        return "Base dynamicGet()";
    }
}




