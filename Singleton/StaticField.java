package Singleton;

/**
 * A singleton is simply a class that is instantiated exactly once. Singletons
 * typically represent either a stateless object such as a function or a system
 * component that is intrinsically unique.
 */

// Static Final Memeber Field
public class StaticField {
    public static final StaticField INSTANCE = new StaticField();

    private StaticField() {
    }

    public void saySomething() {
        System.out.println("Singleton with pulbic final field.");
    }
}
