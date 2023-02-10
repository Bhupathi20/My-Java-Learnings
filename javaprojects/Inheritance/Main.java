package Inheritance;

public class Main {
    
    public static void main(String[] args) {
        
        // inheritance = the process where one class acquires,
        //               the attributes and methods of another.

        Car car = new Car();
        Bicycle cycle = new Bicycle();

        car.go();

        cycle.stop();

        System.out.println(car.speed);
        System.out.println(cycle.speed);

        System.out.println(car.doors);
        System.out.println(cycle.padals);

    }
}
