package anonymousObjects;

import java.util.ArrayList;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.JLabel;

public class Main {
    
    public static void main(String[] args) {
        
       JFrame frame = new JFrame();
       ArrayList<JLabel> deck = new ArrayList<JLabel>() ;


       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(420,420);
       frame.setLayout(new FlowLayout());
       frame.setVisible(true);

    }
}
