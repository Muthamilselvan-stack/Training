import java.util.Scanner;
class Shape{
    protected double area;
    public void calculate_area()
    {
        System.out.println("Area of the shape:");
    }
}
class Square extends Shape
{
    private int a;
    public void calculate_area()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = in.nextInt();
        area = a*a;
        System.out.println("Area of the Squre: "+area);
    }
}
class Circle extends Shape
{
    private double r;
    public void calculate_area()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter r: ");
        r = in.nextInt();
        area = 3.14*r*r;
        System.out.println("Area of Circle: "+area);
    }
    
}
class Main{
    public static void main(String[] args)
    {
        Shape s1 = new Square();
        s1.calculate_area();
        Shape s2 = new Circle();
        s2.calculate_area();
    }
    
}