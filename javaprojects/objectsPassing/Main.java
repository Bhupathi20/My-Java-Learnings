package objectsPassing;

public class Main {
    public static void main(String[] args) {
        
        Garage garage = new Garage();

        Car car = new Car("AUDI");
        Car car1 = new Car("TATA");

        garage.Park(car);
        garage.Park(car1);
    }
    
}
