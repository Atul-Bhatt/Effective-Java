package abstractClasses;

public class Circle extends Shape {
    int radius;

    public Circle(int radius, String color) {
        System.out.println("Circle (Derived Class) Constructor called.");
        this.radius = radius;
        this.color = color;
    }

    public void draw() {
        System.out.println("Drawing a Circle!");
    }
}
