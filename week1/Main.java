package week1;
// Base class Vehicle
class Vehicle {
    String brand;
    String speed;

    // Constructor
    Vehicle(String brand, String speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method to display vehicle details
    void displayVehicleDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

// Derived class Car
class Car extends Vehicle {
    String fuelType;

    // Constructor
    Car(String brand, String speed, String fuelType) {
        super(brand, speed);  // Call Vehicle constructor
        this.fuelType = fuelType;
    }

    // Method to display all details
    void displayDetails() {
        displayVehicleDetails(); // Call base class method
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota", "180km/h", "Petrol");

        // Display its details
        myCar.displayDetails();
    }
}
