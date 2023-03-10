package Polymorphism;

public class Main {
    
    public static void main(String[] args) {
        
        // polymorphism =  greek word for poly-"many", morph-"form"
        //                  the ability of an object to identify as more than one type


        Car car = new Car();
        Bike bike =  new Bike();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bike, boat};

        for(Vehicle x : racers){
            x.go();
        }

    }
}
