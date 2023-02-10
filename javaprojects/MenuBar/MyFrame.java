package MenuBar;

import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{

    JMenuBar menuBar;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	//ImageIcon loadIcon;
	//ImageIcon saveIcon;
	//ImageIcon exitIcon;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        fileMenu.setMnemonic(KeyEvent.VK_F); // alt + f for File menu
        editMenu.setMnemonic(KeyEvent.VK_E); // Alt + e for Edit menu
        helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + h for Help menu
        loadItem.setMnemonic(KeyEvent.VK_L); // L foor load
        saveItem.setMnemonic(KeyEvent.VK_S); // S for Save
        exitItem.setMnemonic(KeyEvent.VK_E); // E for Exit

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == loadItem){
            System.out.println("Beep boop you loaded a item");
        }
        if(e.getSource() == saveItem){
            System.out.println("Beep boop you saved a item");
        }
        if(e.getSource() == exitItem){
            System.exit(0);
        }
        
    }
    
}
