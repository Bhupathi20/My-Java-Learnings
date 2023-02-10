package GenericsInJava;

import javax.print.attribute.standard.Media;

// Generic Classes

public class Examp1 {
    
    // public static void main(String[] args) {
        
    //     MyGenericClass <Integer, Integer> myInt = new MyGenericClass <>(1, 2);
    //     MyGenericClass <Double, Double> myDouble = new MyGenericClass <>(3.14 , 5.23);
    //     MyGenericClass <Character, Character> myChar = new MyGenericClass <>('@', '#');
    //     MyGenericClass <String, Character> myString = new MyGenericClass <>("Hello", '$');


    //     System.out.println(myInt.getVaule());
    //     System.out.println(myDouble.getVaule());
    //     System.out.println(myChar.getVaule());
    //     System.out.println(myString.getVaule());

    // }

    public static void main(String[] args) {
        
        // bounded types = you can create the objects of a generic class to have data
        //                 of specific derived types ex.Number


        MyGenericClass <Integer, Integer> myInt = new MyGenericClass <>(1, 2);
        MyGenericClass <Double, Double> myDouble = new MyGenericClass <>(3.14 , 5.23);

        System.out.println(myInt.getVaule());
        System.out.println(myDouble.getVaule());

    }

}
