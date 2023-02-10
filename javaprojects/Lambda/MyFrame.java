package Lambda;

import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame{
   
    JButton myButton1 = new JButton("My Button #1");
    JButton myButton2 = new JButton("My Button #2");

    MyFrame(){

        myButton1.setBounds(100,100,200,100);
        myButton1.addActionListener(
            (e) -> System.out.println("you clicked button #1")
            );

        myButton2.setBounds(100,200,200,100);
        myButton2.addActionListener(
            (e) -> System.out.println("you clicked Button #2")
        );
        this.add(myButton1);
        this.add(myButton2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
    }


}
