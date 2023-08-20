import java.util.Scanner;
class prog15 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a small number: ");
        int num = in.nextInt();
        int i, j;
        for(i = 0; i < num; i ++) {
            for(j = 0; j < num; j ++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        in.close();
    }
}