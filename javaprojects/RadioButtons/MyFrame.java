package RadioButtons;

import java.awt.*;
import java.awt.event.*;

import javax.lang.model.util.ElementScanner14;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{


    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotDogButton;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaButton = new JRadioButton("Pizza");
        hamburgerButton = new JRadioButton("hamburger");
        hotDogButton = new JRadioButton("hotdog");

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotDogButton);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotDogButton.addActionListener(this);


        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotDogButton);
        this.pack();
        this.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub


        if(e.getSource() == pizzaButton){
            System.out.println("you ordered Pizza");
        }
        else if (e.getSource() == hamburgerButton){
            System.out.println("you ordered hamburger");
        }
        else if(e.getSource() == hotDogButton){

            System.out.println("you ordered hotdog");
        }

        
    }
    


}
