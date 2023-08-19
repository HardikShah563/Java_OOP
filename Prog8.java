import java.util.Scanner;
class Prog8 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        int d = 0, newNum = 0;

        while(num != 0) {
            d = num % 10;
            newNum = (newNum * 10) + d;
            num = num / 10;
        }
        System.out.println("Reversed Number is: " + newNum);
    }
}