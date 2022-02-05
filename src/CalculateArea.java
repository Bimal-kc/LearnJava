import java.util.Scanner;
/**
 * This class will calculate the area of rectangle, square, triangle, rt. triangle, and  circle
 */
/*
The area of a simple, closed, planar curve is the amount of space inside.

Area of rectangle = (l*b)
Area of square = l^2
Area of triangle = (s * (s-a) * (s-b) * (s-c))^(1/2)  (a,b,c = side of triangle, s = semiPerimeter = (a+b+c)/2)
Area of rt. triangle = (base + height)/2
Area of circle = pi * radius^2
Area of parallelogram = base * height
 */
public class CalculateArea {
    static Scanner sc = new Scanner(System.in);
    double length;
    double breadth;
    double base;
    double height;
    double radius;
    double Area;

    public double calcAreaOfRect() {
        System.out.println("Enter the length of rectangle: ");
        length = sc.nextDouble();
        System.out.println("Enter the breadth of rectangle: ");
        breadth = sc.nextDouble();
        Area = length * breadth;
        return Area;

    }

    public double calcAreaOfSquare() {
        System.out.println("Enter the length of square: ");
        length = sc.nextDouble();
        Area = Math.pow(length, 2);
        return Area;

    }

    public double calcAreaOfTriangle() {
        System.out.println("Enter the all the side of Triangle\n");
        System.out.println("a: ");
        double a = sc.nextDouble();
        System.out.println("b: ");
        double b = sc.nextDouble();
        System.out.println("c: ");
        double c = sc.nextDouble();
        double s = (a + b + c) / 2;
        Area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return Area;
    }

    public double calcAreaOfRtTriangle() {
        System.out.println("Enter base of right triangle: ");
        base = sc.nextDouble();
        System.out.println("Enter height of right triangle: ");
        height = sc.nextDouble();
        Area = (base * height) / 2;
        return Area;

    }

    public double calcAreaOfCircle() {
        System.out.println("Enter the radius of circle: ");
        radius = sc.nextDouble();
        Area = Math.PI * Math.pow(radius, 2);
        return Area;

    }

    public double calcAreaOfParallelogram() {
        System.out.println("Enter base of parallelogram: ");
        base = sc.nextDouble();
        System.out.println("Enter height of parallelogram: ");
        height = sc.nextDouble();
        Area = (base * height);
        return Area;
    }

    public static void main(String[] args) {
        while (true) {
            CalculateArea p = new CalculateArea();
            System.out.println("What do you want to calculate?");
            System.out.println("1. Area of Rectangle");
            System.out.println("2. Area of Square");
            System.out.println("3. Area of Triangle");
            System.out.println("4. Area of right triangle.");
            System.out.println("5. Area of circle.");
            System.out.println("6. Area of parallelogram.");
            System.out.println("7. To exit.\n");
            System.out.println("*CHOOSE FROM ABOVE OPTION (1-7)*");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("The Area of rectangle is: " + p.calcAreaOfRect() + "\n");
                    break;
                case 2:
                    System.out.println("The Area of square is: " + p.calcAreaOfSquare() + "\n");
                    break;
                case 3:
                    System.out.println("The Area of triangle is: " + p.calcAreaOfTriangle() + "\n");
                    break;
                case 4:
                    System.out.println("The Area of rt triangle is: " + p.calcAreaOfRtTriangle() + "\n");
                    break;
                case 5:
                    System.out.println("The Area of circle is: " + p.calcAreaOfCircle() + "\n");
                    break;
                case 6:
                    System.out.println("The Area of Parallelogram is: " + p.calcAreaOfParallelogram() + "\n");
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Enter valid option.\n");
            }
        }

    }
}
