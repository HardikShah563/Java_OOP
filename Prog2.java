import java.util.Scanner;

class Prog2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the purchase amount: ");
        int purchaseAmt = in.nextInt();
        if(purchaseAmt < 0) {
            System.out.println("Purchase Amount cannot be negative");
        }

        double discountedAmt = 0.0;
        
        if(purchaseAmt >= 0 && purchaseAmt <= 1000) {
            discountedAmt = purchaseAmt * 0.05;
        }
        else if(purchaseAmt > 1000 && purchaseAmt <= 2000) {
            discountedAmt = 50 + (purchaseAmt - 1000) * 0.075;
        }
        else if(purchaseAmt > 2000 && purchaseAmt <= 3000) {
            discountedAmt = 150 + (purchaseAmt - 2000) * 0.1;
        }
        else if (purchaseAmt > 3000){
            discountedAmt = 300 + (purchaseAmt - 3000) * 0.15;
        }
        else {
            discountedAmt = -1;
        }
        System.out.println("The net discount after purchase is: " + discountedAmt + "rupees only");

        in.close();
    }
}