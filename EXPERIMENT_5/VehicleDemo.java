class Vehicle {
    protected String model;
    protected int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

class Car extends Vehicle {
    private int numDoors;
    private String fuelType;

    public Car(String model, int year, int numDoors, String fuelType) {
        super(model, year);
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + numDoors + ", Fuel: " + fuelType);
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022, 4, "Petrol");
        car.displayInfo();
    }
}
