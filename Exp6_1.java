import java.util.*;

public class Exp6_1 {
    public static void main(String[] args) {
        System.out.println("Hardik Shah    |    16010221025\n");
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Num1 = ");
            int num1 = in.nextInt();
            System.out.print("Num2 = ");
            int num2 = in.nextInt();
            int num = num1 / num2;
            System.out.println("Result = " + (double) num1 / num2);
        } catch (InputMismatchException e) {
            System.out.println("NumberFormatException");
        } catch (ArithmeticException ae) {
            System.out.println("Arithmetic Exception");
        }
    }
}
