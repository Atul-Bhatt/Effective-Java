package Singleton;

public class Main {
    public static void main(String args[]) {
        StaticField oneInstance = StaticField.INSTANCE;

        oneInstance.saySomething();
    }
}
