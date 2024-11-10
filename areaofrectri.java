
// Write a Java program to find the area of a triangle and rectangle using method overloading assign values already.

public class areaofrectri {
    int l, W;
    int b;
    double h;
    public void area(int length,int width){
        l=length;
        W=width;
        int result=l *W;
        System.out.println("Area of the Rectangle = " + result);

    }
    public void area(int breadth,double height){
        b=breadth;
        h=height;
        double result=0.5*breadth*height;
        System.out.println("Area of the Triangle = " +result);
    }
    public static void main(String[] args) {
        areaofrectri obj=new areaofrectri();
        obj.area(10, 10);
        obj.area(30, 20.0);

    }
}
