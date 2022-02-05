import java.util.Scanner;
/**
 * This class will calculate the Volume of cube, cuboid, cylinder, cone, sphere
 */
/*
 The Volume of a solid 3D shape is the amount of space displaced by it.

Volume of cuboid = l * b * h
Volume of cube = l^3
Volume of cylinder = pi * r^2 * h
Volume of cone = (pi * r^2 * h)/3
Volume of sphere = (pi * r^3) * 4/3
 */
public class CalculateVolume {
    static Scanner sc = new Scanner(System.in);
    double length;
    double breadth;
    double height;
    double radius;
    double Volume;

    public double calcVolumeOfCuboid() {
        System.out.println("Enter the length of cuboid: ");
        length = sc.nextDouble();
        System.out.println("Enter the breadth of cuboid: ");
        breadth = sc.nextDouble();
        System.out.println("Enter the height of cuboid: ");
        height = sc.nextDouble();
        Volume = length * breadth * height;
        return Volume;

    }

    public double calcVolumeOfCube() {
        System.out.println("Enter the length of cube: ");
        length = sc.nextDouble();
        Volume = Math.pow(length, 3);
        return Volume;

    }

    public double calcVolumeOfCylinder() {
        System.out.println("Enter the radius of cylinder: ");
        radius = sc.nextDouble();
        System.out.println("Enter the height of cylinder: ");
        height = sc.nextDouble();
        Volume = Math.PI * Math.pow(radius, 2) * height;
        return Volume;
    }

    public double calcVolumeOfCone() {
        System.out.println("Enter the radius of cone: ");
        radius = sc.nextDouble();
        System.out.println("Enter the height of cone: ");
        height = sc.nextDouble();
        Volume = (Math.PI * Math.pow(radius, 2) * height)/3;
        return Volume;
    }
    public double calcVolumeOfSphere() {
        System.out.println("Enter the radius of sphere: ");
        radius = sc.nextDouble();
        Volume = (4 * Math.PI * Math.pow(radius, 3))/3;
        return Volume;

    }

    public static void main(String[] args) {
        while (true) {
            CalculateVolume p = new CalculateVolume();
            System.out.println("What do you want to calculate?");
            System.out.println("1. Volume of cube.");
            System.out.println("2. Volume of cuboid.");
            System.out.println("3. Volume of cylinder.");
            System.out.println("4. Volume of cone.");
            System.out.println("5. Volume of sphere.");
            System.out.println("6. To exit.\n");
            System.out.println("*CHOOSE FROM ABOVE OPTION (1-6)*");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("The Volume of cube is: " + p.calcVolumeOfCube() + "\n");
                    break;
                case 2:
                    System.out.println("The Volume of cuboid is: " + p.calcVolumeOfCuboid()+ "\n");
                    break;
                case 3:
                    System.out.println("The Volume of cylinder is: " + p.calcVolumeOfCylinder() + "\n");
                    break;
                case 4:
                    System.out.println("The Volume of cone is: " + p.calcVolumeOfCone() + "\n");
                    break;
                case 5:
                    System.out.println("The Volume of sphere is: " + p.calcVolumeOfSphere()+ "\n");
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Enter valid option.\n");
            }
        }

    }
}
