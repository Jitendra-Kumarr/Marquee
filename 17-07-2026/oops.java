// package 17-07-2026;

class VideoGameCharacter {
    static String Name; 
    int health;
    int level; 

    void attack(){
        System.out.println("Attackkkk! ! ! ");
    }

}

public class oops {
    public static void main(String[] args) {
        VideoGameCharacter obj = new VideoGameCharacter(); 

        obj.attack();

        VideoGameCharacter.Name = "kelly"; 
        System.out.println(VideoGameCharacter.Name);

    }

}
