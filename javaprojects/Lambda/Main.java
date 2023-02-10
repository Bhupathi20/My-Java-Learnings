package Lambda;

public class Main {
    
    public static void main(String[] args) {
        
        /* lambda expression = 	feature for Java 8 and above
		* 						also known as an anonymous method
		* 						a shorter way to write anonymous classes with only one method
		*
		*						need to use a functional interface or use a pre-defined functional interface
		*						they contain only one abstract method
		*						ex. ActionListener, Runnable, (user-defined)
		*
		*						A Lambda expression can be used in any place where a functional interface is required
		*						How to use a lambda expression:
		*						(arguments) -> {statement/s}
		*/


        // String name = "bro";
        // char symbol = '@';

        // MyInterface myInterface = (x,y) ->  {
        //     System.out.println("hello world!");
        //     System.out.println("hay hiii " + symbol + x);

        // };

        // MyInterface myInterface2 = (x,y) -> {
        //     System.out.println("fuck u " + x + y);
        // };

        // myInterface2.message(name,symbol);



        MyFrame myFrame = new MyFrame();
        

    }
}
