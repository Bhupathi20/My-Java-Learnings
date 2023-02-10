package OOPS;
public class Car {
    String make = "BMW";
    String model = "Corvette";
    int year = 2020;
    String color = "blue";
    double price = 50000.00;

    void drive() {
        System.out.println("you drive the car");
    }

    void brake() {
        System.out.println("you step on the breaks");
    }

    public String toString(){
        return make + "\n" + model+ "\n" + year+ "\n" + color;
        
    }
}
