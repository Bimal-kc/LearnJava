import java.util.Scanner;

/**
 * This class will calculate the perimeter of rectangle, square, triangle, rt. triangle, and  circle
 */
/*
The perimeter of a polygon (or any other closed curve, such as a circle) is the distance around the outside.

perimeter of rectangle = 2*(l+b)
perimeter of square = 4*l
perimeter of triangle = a+b+c (a,b,c = side of triangle)
perimeter of rt. triangle = base + height + hypotenus ( a + b + (a^2 + b^2)^(1/2)
perimeter of circle = 2 * pi * radius
 */
public class CalculatePerimeter {
    static Scanner sc = new Scanner(System.in);
    double length;
    double breadth;
    double base;
    double height;
    double radius;
    double perimeter;

    public double calcPerOfRect(){
        System.out.println("Enter the length of rectangle: ");
        length = sc.nextDouble();
        System.out.println("Enter the breadth of rectangle: ");
        breadth = sc.nextDouble();
        perimeter = 2 * (length + breadth);
        return perimeter;

    }

    public double calcPerOfSquare(){
        System.out.println("Enter the length of square: ");
        length = sc.nextDouble();
        perimeter = 4 * (length);
        return perimeter;

    }

    public double calcPerOfTriangle(){
        System.out.println("Enter the all the side of Triangle\n");
        System.out.println("a: ");
        double a = sc.nextDouble();
        System.out.println("b: ");
        double b = sc.nextDouble();
        System.out.println("c: ");
        double c = sc.nextDouble();
        perimeter = a + b + c;
        return perimeter;
    }

    public double calcPerOfRtTriangle(){
        System.out.println("Enter base of right triangle: ");
        base = sc.nextDouble();
        System.out.println("Enter height of right triangle: ");
        height = sc.nextDouble();
        perimeter = base + height + Math.sqrt(Math.pow(base,2) + Math.pow(height,2));
        return perimeter;

    }

    public double calcPerOfCircle(){
        System.out.println("Enter the radius of circle: ");
        radius = sc.nextDouble();
        perimeter = 2 * Math.PI * radius;
        return perimeter;

    }

    public static void main(String[] args) {
        while (true){
            CalculatePerimeter p = new CalculatePerimeter();
            System.out.println("What do you want to calculate?");
            System.out.println("1. Perimeter of Rectangle");
            System.out.println("2. Perimeter of Square");
            System.out.println("3. Perimeter of Triangle");
            System.out.println("4. Perimeter of right triangle.");
            System.out.println("5. Perimeter of right circle.");
            System.out.println("6. To exit.\n");
            System.out.println("*CHOOSE FROM ABOVE OPTION (1-6)*");
            int option = sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("The perimeter of rectangle is: "+ p.calcPerOfRect()+"\n");
                    break;
                case 2:
                    System.out.println("The perimeter of square is: "+ p.calcPerOfSquare()+"\n");
                    break;
                case 3:
                    System.out.println("The perimeter of triangle is: "+ p.calcPerOfTriangle()+"\n");
                    break;
                case 4:
                    System.out.println("The perimeter of rt triangle is: "+ p.calcPerOfRtTriangle()+"\n");
                    break;
                case 5:
                    System.out.println("The perimeter of circle is: "+ p.calcPerOfCircle()+"\n");
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Enter valid option.\n");
            }
        }

    }
}
