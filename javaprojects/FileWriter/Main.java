package FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) {
        
        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("roses are red \nviolets are blue \nbooty booty booty\nrocking everywhere!");
            writer.append("\n(written by king)");
            writer.close();
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
