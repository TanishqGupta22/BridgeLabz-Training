

public class Circle {

    // Non-static variable
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate and display area of circle
    public void areaCircle() {
        System.out.printf("Area of circle: %.4f", (Math.PI * radius * radius));
    }

    // Method to calculate and display circumference of circle
    public void circumferenceCircle() {
        System.out.printf("\nCircumference of circle: %.4f", (2 * Math.PI * radius));
    }

    // Main method
    public static void main(String[] args) {

        Circle circle = new Circle(2.5); // constructor invocation
        circle.areaCircle();             // area method call
        circle.circumferenceCircle();    // circumference method call
    }
}
