package abstractClasses;

// abstract keyword is used to make a class abstarct in java
public abstract class Shape {
    String color;

    Shape() {
        System.out.println("Shape (Abstract Base Class) constructor called.");
    }

    // Abstract function is like a pure virtual function in C++
    abstract void draw();

    final void finalMethod() {
        System.out.println("This is a final method!");
    }
}
