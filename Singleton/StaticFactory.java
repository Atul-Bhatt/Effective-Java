package Singleton;

public class StaticFactory {
    public static final StaticFactory INSTANCE = new StaticFactory();

    private StaticFactory() {
    }

    // Each time this method is invoked, it will return the same instance.
    public static StaticFactory getInstance() {
        return INSTANCE;
    }

    public void saySomething() {
        System.out.println("Static factory singleton.");
    }

}
