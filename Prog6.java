import java.util.Scanner;
class Prog6 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        int d = 0, sum = 0;
        while(num != 0) {
            d = num % 10;
            sum += d;
            num =  num / 10;
        }
        System.out.println("The sum of all the digits in the number is: " + sum);

        in.close();
    }
}