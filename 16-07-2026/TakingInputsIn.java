// package 16-07-2026;

import java.util.Scanner;

public class TakingInputsIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int i = sc.nextInt();          // integer
        long l = sc.nextLong();        // long
        float f = sc.nextFloat();      // float
        double d = sc.nextDouble();    // double
        boolean b = sc.nextBoolean();  // true/false
        String word = sc.next();       // single word (stops at whitespace)
        String line = sc.nextLine();   // entire line (including spaces)


        sc.close();
    }
}
