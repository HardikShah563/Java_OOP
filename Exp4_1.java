import java.util.Scanner;
abstract class Shape {
    int l1, l2;
    Shape(int l1, int l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    abstract void printArea();
}

class Rectangle extends Shape {   
    Rectangle(int l, int b) {
        super(l, b);
    }

    void printArea() {
        System.out.println("The Area of Rectangle is: " + (l1 * l2));
    }
}

class Triangle extends Shape {
    Triangle(int l1, int l2) {
        super(l1, l2);
    }

    void printArea() {
        System.out.println("The Area of Triangle is: " + (0.5 * l1 * l2));
    }
}

class Circle extends Shape {
    Circle(int r) {
        super(r, 0);
    }

    void printArea() {
        System.out.println("The Area of Circle is: " + (3.14 * l1 * l1));
    }
}

class Exp4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hardik Shah | 16010221025 \n");
        System.out.println("Enter two side lengths: ");
        int l1 = in.nextInt();
        int l2 = in.nextInt();
        
        Rectangle rectangle = new Rectangle(l1, l2);
        rectangle.printArea();

        Triangle triangle = new Triangle(l1, l2);
        triangle.printArea();

        Circle circle = new Circle(l1);
        circle.printArea();

        in.close();
    }
}