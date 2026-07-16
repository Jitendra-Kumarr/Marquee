import java.util.Scanner;

public class StringToMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        String s4 = sc.nextLine();

        char arr[][] = new char[4][4];   

        for (int i = 0; i < 4; i++) arr[0][i] = s1.charAt(i);
        for (int i = 0; i < 4; i++) arr[1][i] = s2.charAt(i);
        for (int i = 0; i < 4; i++) arr[2][i] = s3.charAt(i);
        for (int i = 0; i < 4; i++) arr[3][i] = s4.charAt(i);


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}