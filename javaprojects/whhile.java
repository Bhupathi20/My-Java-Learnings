import java.util.Scanner;

public class whhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while(name.isBlank()){
            System.out.println("enter your name: ");

            name = scanner.nextLine();
        }
    }
}
