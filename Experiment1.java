import java.util.Scanner;
public class experiment1 {
    double pi = Math.PI;
    // Area function to calculate area
    public double Area(double radius) {
        return pi * radius * radius;
    }

    public double Perimeter(double radius) {
        return pi * radius * 2;
    }

    public static void main(String args[]) {
        // Creating an object of the Scanner class
        Scanner in = new Scanner(System.in);
        // Craeting an object of a class
        experiment1 exp1 = new experiment1();
        System.out.println("Name: Hardik Shah \t\t Roll no.: 16010221025");
        System.out.println("Enter radius: "); // Taking inputs from the user
        double radius = in.nextDouble();
        while(radius < 0) {
            System.err.println("radius cannot be negative, try again! ");
            radius = in.nextDouble();
        }
        // Making a function call to find the area and perimeter
        double returnValue = 0;
        returnValue = exp1.Area(radius);
        System.out.println("The area of the circle is: " + returnValue);
        returnValue = exp1.Perimeter(radius);
    }
}
