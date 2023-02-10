package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    
    // exception = an event that occurs during the execution of a program that,
    //              disrupts the normal flow of instructions

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        try{
            

            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whle number to divide by: ");
            int y = scanner.nextInt();

            int z = x/y;

            System.out.println("the result is : " + z);

        }
        catch(ArithmeticException e){
            System.out.println("you cannot divide with zero! Puka Puka");

        }
        catch(InputMismatchException e){
            System.out.println("number enter chyyara puka");
        }
        catch(Exception e){
            System.out.println("something went wrong");
        }
        finally{
            scanner.close();
        }
        
    }




}
