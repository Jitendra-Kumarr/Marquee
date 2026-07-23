
class Building {
    String name; 
    int rooms;
    Building(String name, int rooms){
        this.name = name; 
        this.rooms = rooms; 

        display(this); 
    }
    void display(Building s1){
        System.out.println(s1.name);
        System.out.println(s1.rooms);
    }
}


public class thisKeywordIn {

    public static void main(String[] args) {
        Building CV = new Building("Raman", 50); 
        // System.out.println(CV.rooms);; 
    }
}