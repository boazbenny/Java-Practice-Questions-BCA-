
// Write a Java program to find the area of a triangle and rectangle using method overloading input using command line argument.

public class areaofrectricommand {
    int l, W;
    int b;
    double h;
    public void area(int length, int width) {
        l = length;
        W = width;
        int result = l * W;
        System.out.println("Area of the Rectangle = " + result);
    }

    public void area(int breadth, double height) {
        b = breadth;
        h = height;
        double result = 0.5 * b * h;
        System.out.println("Area of the Triangle = " + result);
    }

    public static void main(String[] args) {
        if (args.length < 4 && args.length >4 ) {
            System.out.println("Please provide four arguments: length, width, breadth, and height.");
            return;
        }
        int length = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        int breadth = Integer.parseInt(args[2]);
        double height = Double.parseDouble(args[3]);
        areaofrectricommand obj = new areaofrectricommand();
        obj.area(length, width);     
        obj.area(breadth, height); 
    }
}
