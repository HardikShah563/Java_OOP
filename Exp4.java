import java.util.Scanner;

class Rectangle {
    int length, breadth;
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    int calcArea() {
        return this.length * this.breadth;
    }

    int calcPerimeter() {
        return 2 * (this.length + this.breadth);
    }
}

class Square extends Rectangle {
    int side;
    Square(int side) {
        super(side, side);
        this.side = side;
    }
}

class Experiment4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hardik Shah | 16010221025 \n");
        System.out.println("Enter the length and breadth of the rectangle: ");
        int length = in.nextInt();
        int breadth = in.nextInt();

        System.out.println("Enter the length of the side of the square: ");
        int side = in.nextInt();
        
        Rectangle rect = new Rectangle(length, breadth);
        System.out.println("The area and perimeter of the rectangle respectively are: ");
        System.out.println(rect.calcArea());
        System.out.println(rect.calcPerimeter());
        
        Square sq = new Square(side);
        System.out.println("The area and perimeter of the square respectively are: ");
        System.out.println(sq.calcArea());
        System.out.println(sq.calcPerimeter());

        Square arrOfSquare[] = new Square[10];
        for(int i = 0; i < arrOfSquare.length; i ++) {
            System.out.println("Enter the length of the side of the square: ");
            side = in.nextInt();
            arrOfSquare[i] = new Square(side);
        }
        System.out.println("The area of ten squares are: ");
        for(int i = 0; i < arrOfSquare.length; i ++) {
            System.out.println("Area of Square " + (i + 1) + " : " + (arrOfSquare[i].calcArea()));
        }
        
        in.close();
    }
}