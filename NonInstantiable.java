public class NonInstantiable {
    /**
     * Sometimes you need a class that groups static methods and static fields. But
     * these classes don't need to be instantiated for eg. java.lan.Math or
     * java.util.Arrays. In order to make these classes non-instantiable, we make
     * their default constructor private.
     */

    private NonInstantiable() {
        throw new AssertionError();
    }

    // The default constructor throws an error so this can be prevented.

    // public static NonInstantiable getInstance() {
    // return new NonInstantiable();
    // }
}
