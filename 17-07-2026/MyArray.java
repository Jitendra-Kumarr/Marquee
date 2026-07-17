// package 17-07-2026;

public class MyArray {
    int data[] = new int[10]; 
    int size = 0; 

    public void add(int val){
        if(size == data.length){
            System.out.println("Array is full");
            return; 
        }
        data[size] = val; 
        size++;
    }

    int length(){
        return size;
    }

    public int get(int index){
        if(index < 0 || index >= size){
            System.out.println("Invalid index");
            return -1; 
        }
        return data[index]; 
    }

    public void update(int index, int val){
        if(index < 0 || index >= size){
            System.out.println("Invalid index");
            return;
        }
        data[index] = val; 
    }

    public static void main(String[] args) {
        MyArray arr = new MyArray();
        
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);

        int len = arr.length();
        System.out.println(len);

        int ele = arr.get(2);
        System.out.println(ele);

        arr.update(3, 50); 

        int element = arr.get(3);
        System.out.println(element);

    }
}
