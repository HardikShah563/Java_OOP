import java.util.Scanner;
class Prog4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temperature in farhenite scale: ");
        double farhenite = in.nextDouble();
        System.out.println("Temperature in celsius is: " + ((farhenite - 32) / 1.8));

        in.close();
    }
}
