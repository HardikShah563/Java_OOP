import java.util.Scanner;
public class exp1_1 {
    public static void main(String args[]) {
        // Creating an object of a scanner class
        Scanner in = new Scanner(System.in);
        // initializing and declaring variables
        int n, i, sum = 0;
        System.out.println("Enter tha value of n: ");
        n = in.nextInt();
        // while loop check if user enters an invalid number!
        while(n < 0) {
            System.out.println("Enter a valid num");
            n = in.nextInt();
        }
        for (i = 1; i <= n; i ++) {
            if(i % 6 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of all the numbers from 1 to n that are divisible by 3 is: " + sum);
    }
}
