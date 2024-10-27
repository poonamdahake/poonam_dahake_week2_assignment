import java.util.Scanner;
public class Rectangle {
    private double length;
    private double width;
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
        System.out.println("Default constructor called. Default values 1.");
    }

    public Rectangle(double side) {
        this.length = side;
        this.width = side;
        System.out.println("Constructor with one parameter called. It's a square.");
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Constructor with two parameters called. It's a rectangle.");
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }

    public double calculateArea(double side) {
        return side * side;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Rectangle rect1 = new Rectangle();
        System.out.println("Area using rect1 (default constructor): " + rect1.calculateArea());

        System.out.print("Enter the side length for a square: ");
        double side = scanner.nextDouble();
        Rectangle square = new Rectangle(side);
        System.out.println("Area of the square: " + square.calculateArea());

        System.out.print("Enter the length for the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width for the rectangle: ");
        double width = scanner.nextDouble();
        Rectangle rect2 = new Rectangle(length, width);
        System.out.println("Area of the rectangle: " + rect2.calculateArea());

        System.out.println("--- Testing Method Overloading ---");
        System.out.print("Enter length for rectangle (method overloading): ");
        double len = scanner.nextDouble();

        System.out.print("Enter width for rectangle (method overloading): ");
        double wid = scanner.nextDouble();
        System.out.println("Overloaded method: Area of rectangle: " + rect2.calculateArea(len, wid));

        System.out.print("Enter side for square (method overloading): ");
        double s = scanner.nextDouble();
        System.out.println("Overloaded method: Area of square: " + rect2.calculateArea(s));

        scanner.close();
    }
}

