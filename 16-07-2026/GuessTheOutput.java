// package 16-07-2026;

public class GuessTheOutput {
    public static void main(String[] args) {
        int b = 24; 
        int c = 0; 

        int sum = 0; 

        while (b > 0) {
            int num = b&1;  //24 in binary is 11000. Bitwise & with 1 checks only the last bit. Since 24 is even, its last bit is 0.
            sum += num; 
            b /= 10;
        }

        System.out.println(sum);  // 0
    }
}
