import java.util.Scanner;

public class DistanceBetween2Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int n = sc.nextInt(); 

        int arr[] = new int[n]; 
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); 
        }   

        int count = 0; 
        for(int i=0; i<n; i++){
            if(arr[i]%2 == 0){
                count++;
            }
        }

        if(count < 2){
            System.out.println("-1");
        } else {
            int firstIndex = -1; 
            int secondIndex = -1; 
            
            for(int i=0; i<n; i++){
                if(arr[i]%2 == 0){
                    firstIndex = i; 
                    for(int j=i+1; j<n; j++){
                        if(arr[j]%2 == 0){
                            secondIndex = j; 
                            break; 
                        }
                    }
                    break; 
                }
            }
            System.out.println(secondIndex-firstIndex);
        }
            
        sc.close();
    }
}
