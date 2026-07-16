// package 16-07-2026;

public class SumofDigits {
    public static void main(String[] args) {
        int number = 78123; 

        int SumofDigits = 0; 

        while(number != 0){
            int lastDigit = number%10;  
            SumofDigits += lastDigit; 
            number /= 10; 
        }

        System.out.println(SumofDigits);
    }
}
