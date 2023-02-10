import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

    //    System.out.println("what is your name?");
    //    String name = scanner.nextLine();

    //    System.out.println("hello " + name);

    // String name = JOptionPane.showInputDialog("enter your name");
    // JOptionPane.showMessageDialog(null, "hello " + name);

    //  int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age")) ;
    //  JOptionPane.showMessageDialog(null, "your age " + age + " years");

    //  double height = Double.parseDouble(JOptionPane.showInputDialog("what is your height"));
    //  JOptionPane.showMessageDialog(null, "your height is " + height + " feet");

    // double x = 3.15; 
    // double y = -10;

    // double z = Math.max(x, y);
    // System.out.println(z);
    // double a = Math.floor(x);
    // System.out.println(a);

    int rows;
    int cols;
    String symbol = "";

    System.out.println("enter no of rows: ");
    rows = scanner.nextInt();
    System.out.println("enter no of cols: ");
    cols = scanner.nextInt();

    System.out.println("enter the symbol u want to enter: ");
    symbol = scanner.next();

    for (int i=1; i<=rows; i++) {
        System.out.println();
        for(int j=1; j<=cols; j++){
            System.out.print(symbol);
        }
    }


   }
}
