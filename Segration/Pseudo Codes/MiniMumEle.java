// package Segration.Pseudo Codes;
import java.util.Scanner;


public class MiniMumEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int n = sc.nextInt(); 

        int arr[] = new int[n]; 
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); 
        }

        int minimum = Integer.MAX_VALUE; 

        for(int i=0; i<n; i++){
            if(arr[i] < minimum){
                minimum = arr[i]; 
            }
        }
        System.out.println(minimum);

        sc.close();
    }
}
