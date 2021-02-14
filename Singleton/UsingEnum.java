package Singleton;

/**
 * This method provides the serialization machinery for free, and provides an
 * ironclad guarantee against multiple instantiation, even in the face of
 * sophisticated serialization or reflection attacks.
 */

public enum UsingEnum {
    INSTANCE;

    public void saySomething() {
        System.out.println("Singleton Class using Enum.");
    }
}
