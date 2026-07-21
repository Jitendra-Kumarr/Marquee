// package 21-07-2026;

public class CarParking {
    int slots[];      
    int capacity[];   

    public CarParking(int big, int medium, int small) {
        slots = new int[]{big, medium, small};
        capacity = new int[]{big, medium, small};
    }

    public boolean addCar(int carType) {
        int index = carType - 1;
        if (slots[index] > 0) {
            slots[index]--;
            return true;
        }
        return false;
    }

    public boolean removeCar(int carType) {
        int index = carType - 1;
        if (slots[index] < capacity[index]) {
            slots[index]++;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // 1 big, 1 medium, 0 small slots
        CarParking parkingSystem = new CarParking(1, 1, 0);

        System.out.println(parkingSystem.addCar(1)); 
        System.out.println(parkingSystem.addCar(2)); 
        System.out.println(parkingSystem.addCar(3)); 
        System.out.println(parkingSystem.addCar(1)); 

        System.out.println(parkingSystem.removeCar(1)); 
        System.out.println(parkingSystem.addCar(1));    
        System.out.println(parkingSystem.removeCar(3)); 
    }
}