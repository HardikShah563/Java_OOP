import java.util.Scanner;
class prog14 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is Oddish or Evenish: ");
        int num = in.nextInt();
        int d, sum = 0;
        while(num != 0) {
            d = num % 10;
            sum += d;
            num = num / 10;
        }
        if(sum % 2 == 0) {
            System.out.println("Evenish Number!");
        }
        else {
            System.out.println("Oddish Number!");
        }
        in.close();
    }
}