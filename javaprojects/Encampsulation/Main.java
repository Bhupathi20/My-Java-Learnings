package Encampsulation;

public class Main {
    
    public static void main(String[] args) {
        
        // Encapsulation = attributes of class will be hidden or private,
        //                 Can be accessed only through methods (getters & setters)
        //                 you should make attributes private if you don't have a reason to make them public /protected


        Car car = new Car("BMW", "Cupe", 2022);

        car.setModel("Luxury");

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

    }
}
