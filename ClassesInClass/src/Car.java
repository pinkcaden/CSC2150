
public class Car {
    // Attributes (fields)
    String brand;
    String model;
    int year;

    // Constructor: Used to initialize objects
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method (behavior)
    public void start() {
        System.out.println(brand + " " + model + " is starting.");
    }

    public void drive() {
        System.out.println(brand + " " + model + " is driving.");
    }

    public void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}