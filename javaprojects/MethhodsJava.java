public class MethhodsJava {
    public static void main(String[] args) {
        String name = "bro";
        hello(name);
    }

    static void hello(String name) {
        System.out.println("hello " + name);
    }



    // overloading methods

    static int add(int a, int b){
        System.out.println("this is method overloading #1");
        return a+b;
    }
    static int add(int a, int b, int c){
        System.out.println("this is method overloading #2");
        return a+b+c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("this is method overloading #3");
        return a+b+c+d;
    }

    static double add(double a, double b){
        System.out.println("this is method overloading #1");
        return a+b;
    }
    static double add(double a, double b, double c){
        System.out.println("this is method overloading #2");
        return a+b+c;
    }
    static double add(double a, double b, double c, double d){
        System.out.println("this is method overloading #3");
        return a+b+c+d;
    }
}
