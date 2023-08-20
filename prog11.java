import java.util.Scanner;
class prog11 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number between 0 to 9: ");
        int num = in.nextInt();
        System.out.println(num + ((num*10)+num) + ((num*100) + (num*10) + num));
        in.close();
    }
}