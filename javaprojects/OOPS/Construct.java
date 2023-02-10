package OOPS;

public class Construct {
    public static void main(String[] args) {
        
        Human human1 = new Human("raju",25, 78);

        Human human2 = new Human("king",30, 52);

        System.out.println(human1.name);
        System.out.println(human2.age);
        
        human1.eat();
        human2.drink();

    }
}
