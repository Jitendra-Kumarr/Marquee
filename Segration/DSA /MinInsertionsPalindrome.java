import java.util.Scanner;
public class MinInsertionsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();

        // Step 1: Find LPS using DP
        String rev = new StringBuilder(str).reverse().toString();
        int dp[][] = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (str.charAt(i - 1) == rev.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];  // chars match
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]); // take max
                }
            }
        }

        int lps = dp[n][n];

        // Step 2: Answer = n - LPS
        System.out.println("Minimum insertions: " + (n - lps));
        sc.close();
    }
}