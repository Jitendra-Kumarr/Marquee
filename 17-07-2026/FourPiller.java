// package 17-07-2026;

class Animal {
    private static int count; 
    int age; 
    String name; 

    private int update(int val){
        count = val; 
        return count; 
    }

    // public int getCount(){
    //     return count; 
    // }

    int callUpdate(int val){
        return update(val);   // called from WITHIN the class — allowed
    }



    //------------------------------------------ polymorphism ------------------------------------------------------
    void speak(int val){
        System.out.println("It speaks : 1 2 3 4 ");
    }

    void speak(boolean val){
        System.out.println("It speaks : True Or False ");
    }

    void speak(double val){
        System.out.println("It speaks : 4.4 ");
    }
}


public class FourPiller {
    public static void main(String[] args) {
        Animal an = new Animal(); 
        int data = an.callUpdate(10); 
        System.out.println(data);


        //------------------------------------------ polymorphism ----------------------------------------------------
        Animal dog = new Animal(); 
        Animal cat = new Animal(); 
        Animal monkey = new Animal(); 

        dog.speak(43);
        cat.speak(true);
        monkey.speak( 4.3f);

    }

}
