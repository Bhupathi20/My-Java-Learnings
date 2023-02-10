package GUIJava;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
     
    MyFrame(){

        this.setTitle("JFrame title goes here"); // sets title of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of the application
        this.setResizable(false); // prevent frame from being resized
        this.setSize(420,420); // sets the x-dimension, and y-dimension of the frame
        this.setVisible(true); // make frame 
        
        ImageIcon image  = new ImageIcon("picture.png");  // create an imageIcon
        this.setIconImage(image.getImage()); // change icon of frame
        this.getContentPane().setBackground(new Color(123,50,250)); // change color of background
    }
}
