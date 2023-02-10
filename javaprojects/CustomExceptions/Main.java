package CustomExceptions;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
       
        // exception = an event, after exicution, that disrupts the normal flow of the program
        // ex. ArthmeticException, ArrayIndexOutOftheBoundsException, FileNotFoundException

        // user defined exceptions = custom exceptions
        // ex. DuplicateEmail, InvalidCreditException, AgeException

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age = scan.nextInt();

        try{
            checkAge(age);
        }
        catch(Exception e){
            System.out.println("A Problem Occured: " + e);
        }
        

    }

    static void checkAge(int age) throws AgeException{

        if(age< 18) {

            throw new AgeException("\n" + "you must be 18+ to sign up");

        }
        else{
            System.out.println("your are now signed up!");
        }

    }
}
