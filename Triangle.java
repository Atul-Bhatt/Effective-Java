public class Triangle {
    double base;
    double height;

    // Define a constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double findArea() {
        return (this.base * this.height) / 2;
    }
}
