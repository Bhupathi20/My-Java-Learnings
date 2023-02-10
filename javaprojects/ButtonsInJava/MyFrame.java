package ButtonsInJava;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{
    

    JButton button;
    JLabel label;

    MyFrame(){

        // ImageIcon icon = new ImageIcon("th.jpg");
        ImageIcon icon2 = new ImageIcon("picture.png");


        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150,250,150,150);
        label.setVisible(false);



        button  = new JButton();
        button.setBounds(100,100,250,100);
        button.addActionListener(this);
        button.setText("I'm a Button");
        button.setFocusable(false);
        // button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-10);
        button.setForeground(Color.CYAN);
        button.setBackground(Color.gray);
        button.setBorder(BorderFactory.createEtchedBorder());
        // button.setEnabled(false);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == button){

            System.out.println("Fuck");
            // button.setEnabled(false); // for only click once

            label.setVisible(true);
        
        }
    }

}
