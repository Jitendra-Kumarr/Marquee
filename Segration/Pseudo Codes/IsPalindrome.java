// package Segration.Pseudo Codes;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        String str = sc.next(); 
        
        int start = 0; 
        int end = str.length()-1; 
        boolean isPalindrome = true; 


        while (start < end) {
            if(str.charAt(start) != str.charAt(end)){
                isPalindrome = false; 
                break; 
            }
            start++; end--;
        }

        System.out.println(isPalindrome ? "Yes" : "No");

        sc.close();
    }
}
