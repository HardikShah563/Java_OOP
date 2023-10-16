import java.util.*;

public class Exp6_2 {
    public static void main(String[] args) {
        System.out.println("Hardik Shah    |    16010221060\n");
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Num1 = ");
            int num1 = in.nextInt();
            System.out.print("Num2 = ");
            int num2 = in.nextInt();
            int num = num1 / num2;
            System.out.println("Result = " + (double) num1 / num2);
        } catch (InputMismatchException | ArithmeticException e) {
            if (e.toString().equals("java.lang.ArithmeticException: / by zero"))
                System.out.println("ArithmeticException");
            else
                System.out.println("NumberFormatException");
        }
    }
}