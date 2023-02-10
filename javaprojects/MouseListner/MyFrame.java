package MouseListner;

import java.awt.Color;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame implements MouseListener{
    
    JLabel lable;
    ImageIcon smile;
    ImageIcon nervous;
    ImageIcon pain;
    ImageIcon dizzy;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        // this.setLayout(null);

        // lable = new JLabel();
        // lable.setBounds(0,0,100,100);
        // lable.setBackground(Color.red);
        // lable.setOpaque(true);
        // lable.addMouseListener(this);

        // this.add(lable);

        this.setLayout(new FlowLayout());

        lable = new JLabel();
        lable.addMouseListener(this);

        smile = new ImageIcon("javaprojects/MouseListner/smile.png");
        nervous = new ImageIcon("javaprojects/MouseListner/grim.png");
        pain = new ImageIcon("javaprojects/MouseListner/headbandage.png");
        dizzy = new ImageIcon("javaprojects/MouseListner/woozy.png");

        lable.setIcon(smile);

        this.add(lable);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when the mouse button has been clicked (pressed and released) on a component

        // System.out.println("you clicked the mouse");
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // invoked when a mouse button has been pressed on a component

        // System.out.println("you pressed the mouse");
        // lable.setBackground(Color.yellow);
        lable.setIcon(pain);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // invoked when a mouse button has been released on a component
        
        // System.out.println("you relesed the mouse");
        // lable.setBackground(Color.green);
        lable.setIcon(dizzy);
   }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Invoked when the mouse enters a component
        // System.out.println("you entered the component");
        // lable.setBackground(Color.BLUE);
        lable.setIcon(nervous);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Invoked when the mouse exits a component
        // System.out.println("you exited the component");
        // lable.setBackground(Color.red);
        lable.setIcon(smile);
    }


}
