import java.util.Scanner;

/**
 * PalindromeString
 */
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String str = sc.next(); 

        int start = 0;
        int end = str.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("It's not a palindrome!");
        }
        
    }
}