/* Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet from a-z).*/
import java.util.*;
public class JavaC {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: \n");  
        String str= sc.nextLine(); 
        boolean isPangram = isPangram(str);
        if (isPangram) {
            System.out.println("The string is a Pangram.");
        } else {
            System.out.println("The string is not a Pangram.");
        }
    }
    public static boolean isPangram(String str) {
        boolean[] alphabet = new boolean[26];
        int alphabetSize = 26;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            } else if ('A' <= ch && ch <= 'Z') {
                alphabet[ch - 'A'] = true;
            }
        }
        for (int i = 0; i < alphabetSize; i++) {
            if (!alphabet[i]) {
                return false;
            }
        }
        return true;
    }
}
