import java.util.Scanner;
class Prog5 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of students in the class");
        int no = in.nextInt();

        int marks[] = new int[no];
        int best = 0, average = 0, belowAverage = 0, fail = 0, i = 0;
        System.out.println("Enter the marks of students in the class");
        for(; i < marks.length; i ++) {
            marks[i] = in.nextInt();
            while(marks[i] < 0 || marks[i] > 100) {
                System.out.println("The marks can range from 0 to 100 only!");
                marks[i] = in.nextInt();
            }
        }

        for(i = 0; i < marks.length; i ++) {
            if(marks[i] >= 81) {
                best ++;
            }
            if(marks[i] >= 61 && marks[i] <= 80) {
                average ++;
            }
            if(marks[i] >= 41 && marks[i] <= 60) {
                belowAverage ++;
            }
            if(marks[i] <= 40) {
                fail ++;
            }
        }
        System.out.println("The students obtaining marks in the range of 81 to 100 are: " + best);
        System.out.println("The students obtaining marks in the range of 61 to 80 are: " + average);
        System.out.println("The students obtaining marks in the range of 41 to 60 are: " + belowAverage);
        System.out.println("The students obtaining marks less than 40 are: " + fail);
        

        in.close();
    }
}