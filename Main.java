// 7.Create an interface Shape and a child class Circle. Shape has member function calculateArea() and a constant data member pi(3.14). Write a java program to compute area.

interface Shape {
    double PI = 3.14;
    double calculateArea();
}

class Circle implements Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        double area=PI * radius * radius;
        return area;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Area of the Circle: " + circle.calculateArea());
    }
}
