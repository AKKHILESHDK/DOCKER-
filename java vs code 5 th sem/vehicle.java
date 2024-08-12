class Vehicle {
    public void drive() {
        System.out.println("Driving a vehicle");
    }
}

class Bike extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing a bike");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        Bike bike = new Bike();
        
        car.drive(); // Output: Driving a vehicle
        bike.drive(); // Output: Repairing a bike
    }
}
