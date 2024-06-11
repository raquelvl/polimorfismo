package sem.polimorfismo;

/**
 * Exemplo que demonstra que métodos estáticos não são polimórficos.<br>
 * @author Raquel Lopes
 *
 */
public class StaticDerived2 extends StaticSuper {
    public static String STATIC_STRING = "Derived1 Static String";

    public static String staticGet() {
        return "Derived1 staticGet()";
    }

    @Override
    public String dynamicGet() {
        return "Derived1 dynamicGet()";
    }
}
