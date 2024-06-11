package sem.polimorfismo;

/**
 * Exemplo que demonstra que métodos estáticos não são polimórficos.<br>
 * @author Raquel Lopes
 *
 */
public class StaticPolymorphism {
    /**
     * @param args
     */
    public static void main(String[] args) {
        StaticSuper s1 = new StaticDerived1();
        StaticSuper s2 = new StaticDerived2();
        StaticDerived1 d1 = new StaticDerived1();
        StaticDerived2 d2 = new StaticDerived2();
        printStaticObject(s1);
        printStaticObject(s2);
        printStaticObject(d1);
        printStaticObject(d2);
    }

    private static void printStaticObject(StaticSuper s) {
        System.out.println(s.staticGet());
        System.out.println(s.dynamicGet());
        System.out.println(s.STATIC_STRING);
        System.out.println("______________________");
    }

// você pode descomentar os métodos abaixo para conseguir acessar
// os métodos das subclasses de StaticSuper
// private static void printStaticObject(StaticDerived1 s) {
// System.out.println(s.staticGet());
// System.out.println(s.dynamicGet());
// System.out.println(s.STATIC_STRING);
// System.out.println("______________________");
// }
// 
// private static void printStaticObject(StaticDerived2 s) {
// System.out.println(s.staticGet());
// System.out.println(s.dynamicGet());
// System.out.println(s.STATIC_STRING);
// System.out.println("______________________");
// }
}
