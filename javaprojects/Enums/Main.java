package Enums;

enum Planet {
    MERCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    URANUS(7),
    NEPTUNE(8),
    PLUTO(9);

    int number ;
    Planet(int number){
        this.number = number;
    }

}
public class Main {
    
    public static void main(String[] args) {
        
        //  enum = enumarated (ordered listing of items in a collection)
        // Grouping of constats that behave similarly to objects

        Planet myPlanet = Planet.EARTH;
        canILiveHere(myPlanet);

    }

    static void canILiveHere(Planet myPlanet){

        switch(myPlanet) {
            case EARTH: 
            System.out.println("you can live here :)");
            System.out.println("this is planet #" + myPlanet.number);
            break;
            default :
            System.out.println("you cannot live here.... yet");
            System.out.println("this is planet #" + myPlanet.number);
            break;
        }
    }
}
