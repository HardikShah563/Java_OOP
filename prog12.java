import java.util.Scanner;
class prog12 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers such that a is raised to the power of what in order to equal b: ");
        System.out.println("Enter the value of a: ");
        int a = in.nextInt();
        System.out.println("Enter the value of b: ");
        int b = in.nextInt();
        System.out.println((double)(Math.log(b))/(double)(Math.log(a)));
        in.close();
    }
}