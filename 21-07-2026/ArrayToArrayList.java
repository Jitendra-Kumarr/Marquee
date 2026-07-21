// package 21-07-2026;


class ArrayList1{
    int arr1[];
    ArrayList1(int arr[]){
        arr = new int[arr1.length]; 
        for(int i=0; i<arr1.length; i++){
            arr[i] = arr1[i]; 
        }

    }

    int get(int index) {
        return arr1[index];
    }
    
}

public class ArrayToArrayList {
    public static void main(String[] args) {
        int newArr[] = {1,2,5,7,8}; 
        ArrayList1 arrClass = new ArrayList1(newArr); 

        System.out.println(arrClass.get(0));
    }
}
