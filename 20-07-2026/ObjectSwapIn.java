// package 20-07-2026;

class A {
    int number = 23; 
}

class B {
    int number2 = 24; 
}

public class ObjectSwapIn {
    public static void main(String[] args) {
        A a = new A(); 
        B b = new B(); 
        
        int temp = a.number; 
        a.number = b.number2; 
        b.number2 = temp; 

        System.out.println("After swap: a.number = " + a.number + ", b.number2 = " + b.number2);

    }
}
