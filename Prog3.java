import java.util.Scanner;
class Prog3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("The daily maximum temperature is to be recorded, provide with the corresponding values: ");
        int temperature[][] = new int[7][10];
        int i, j;
        for(i = 0; i < 7; i ++) {
            for(j = 0; j < 10; j ++) {
                System.out.println("Enter the highest temperature of city " + (j + 1) + "on July " + (i + 1) + ": ");
                temperature[i][j] = in.nextInt();
            }
        }

        int highestDay = 0, highestCity = 0, highestTemp = temperature[0][0];
        
        for(i = 0; i < 7; i ++) {
            for(j = 0; j < 10; j ++) {
                if(temperature[i][j] > highestTemp) {
                    highestTemp = temperature[i][j];
                    highestDay = i + 1;
                    highestCity = j + 1;
                }
            }
        }
        System.out.println("The highest temperature ever recorded is: " + highestTemp + " degrees");
        System.out.println("The city with the highest temperature is: City " + highestCity);
        System.out.println("The date on which city " + highestCity + " had the highest temperature on July " + highestDay);
    }
}