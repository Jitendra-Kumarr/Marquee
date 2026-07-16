// package 16-07-2026;

public class ArrayBuilding {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 6, 4, 1}; 

         int maxVal = Integer.MIN_VALUE; 

         for(int i=0; i<arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i]; 
            }
         }

         for(int i=0; i<maxVal; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[j] >= maxVal-i){                       //maxVal <= arr[j]+i
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
         }
    }
}
