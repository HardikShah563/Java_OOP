import java.util.Scanner;
class Prog10 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String name;
        int counter = 0;
        System.out.println("Who is the inventor of c++? ");
        while(true) {
            name = in.nextLine();
            if(name.equals("Bjarne Stroustrup")) {
                System.out.println("Good!");
                break;
            }
            else if (counter == 2) {
                System.out.println("The answered wrong for 3 times. \nThe Inventor of c++ is Bjarne Stroustrup!");
                break;
            }
            else {
                counter ++;
                System.out.println("Try again!");
            }
        }
        in.close();
    }
}