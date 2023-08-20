import java.util.Scanner;
class Prog9 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int i = 0, counter = 0;
        String newWord = "";

        System.out.println("Enter a sentence: ");
        String str = in.nextLine();
        
        System.out.println("Enter the word that you want to find: ");
        String word = in.next();
        
        for(i = 0; i < str.length(); i ++) {
            if(str.charAt(i) != ' ') {
                newWord = newWord + str.charAt(i);
            }
            else {
                if(newWord == word) {
                    counter ++;
                }
                newWord = "";
            }
        }

        System.out.println("The word occurs " + counter + " in the sentence. ");

        in.close();
    }
}

// WRONG CODE
// INCOMPLETE CODE
// WRONG RESULT
// NEED FIXES