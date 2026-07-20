// package 20-07-2026;

class Animal {
    private void eat(){
        System.out.println("Animal is Eating !");
    }

    public void CallEat(){  //private function ko access karne ke liye hum ek public methnod bna ke ussme call kar sakte hai. 
        eat();
    }
}

class Dog extends Animal {
    void sound(){
        System.out.println("bhow bhow");
        // eat();
    }
}

public class InheritanceIn {
    public static void main(String[] args) {
        Dog d = new Dog(); 
        Dog newD = d; 

        // newD.sound(); 
        d.CallEat();
    }
}
