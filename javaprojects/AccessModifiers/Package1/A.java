package AccessModifiers.Package1;
import AccessModifiers.Package2.*;

public class A {

    protected String protectedMessage = "this is protected";
    
   
    public static void main(String[] args) {

        B b = new B();

        // System.out.println(b.privateMessage);

    }
}
