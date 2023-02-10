package FileClass;

import java.io.File;

public class Main {
    
    public static void main(String[] args) {
        
        // file  =  an abstract representation of file and directory pathnames
   
        File file = new File("javaprojects\\ExceptionHandling");

        if(file.exists()){
            System.out.println("that fie exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
        }
        else{
            System.out.println("file ledura puka");
        }
   
   
   
   
   
   
    }
}
