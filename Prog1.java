import java.util.Scanner;
class Prog1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        boolean flag = false;
        System.out.println("Enter your marks in maths: ");
        int mathsMarks = in.nextInt();
        System.out.println("Enter your marks in physics: ");
        int phyMarks = in.nextInt();
        System.out.println("Enter your marks in chemistry: ");
        int chemMarks = in.nextInt();
        if(mathsMarks + phyMarks >= 150) {
            flag = true;
        }
        
        if(mathsMarks >= 60 && phyMarks >= 50 && chemMarks >= 40) {
            flag = true;
        }
        
        if(flag) {
            System.out.println("You are admitted into college");
        }
        else {
            System.out.println("You are not admitted into college");
        }

        in.close();
    }
}