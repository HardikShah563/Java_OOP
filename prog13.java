import java.util.Scanner;
class prog13 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to prove whether it is Disarium or not: ");
        int num = in.nextInt();
        int numDub = num;
        int d = 0, sum = 0, length = 0;
        while(num != 0) {
            d = num % 10;
            num = num / 10;
            length ++;
        }
        num = numDub;
        while(num != 0) {
            d = num % 10;
            sum += Math.pow(d, length);
            num = num / 10;
            length --;
        }
        if(sum == numDub) {
            System.out.println("Disarium Number!");
        }
        else {
            System.out.println("Not a Disarium Number!");
        }

        in.close();
    }
}