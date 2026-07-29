// package 29-07-2026;
import java.util.*;

import java.util.ArrayList;

class CustomArray<T>{
    T[] Data; 
    int Capacity = 10; 
    @SuppressWarnings("unchecked")
    CustomArray(){
        Data = (T[]) new Object[Capacity] ; 
    }
}

public class WorkingWithArrayListIn {
    public static void main(String[] args) {
        // ArrayList<Integer> arr = new ArrayList<>(); 

        // arr.add(4); 
        // // arr.add("Hello, World! "); 

        // System.out.print(arr);

        CustomArray<Integer> arr = new CustomArray<>(); 
        System.out.println(arr.Data);
    }
}
