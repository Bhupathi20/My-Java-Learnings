package SuperKeyWord;

public class Main {
    public static void main(String[] args) {
        
        // super = keyword refers to the superclass (parent) of an object
        //         very similar to the "this" keyword

        Hero hero1 = new Hero("batman", 40, "some");
        Hero hero2 = new Hero("superman", 1000, "everything");
        Person per = new Person("king", 50);

        System.out.println(hero2.toString());
        System.out.println(per.toString());
    }
}
