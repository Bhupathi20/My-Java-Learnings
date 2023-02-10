package JOptionPane;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        

        // JOptionPane = pop up a standard diaog box that prompts users for a value
        //               or informs them of something



        // JOptionPane.showMessageDialog(null, "this is some useless info", "Title", JOptionPane.PLAIN_MESSAGE);

        // JOptionPane.showMessageDialog(null, "here is more useless info", "Title", JOptionPane.INFORMATION_MESSAGE);

        // JOptionPane.showMessageDialog(null, "Really?", "Title", JOptionPane.QUESTION_MESSAGE);

        // JOptionPane.showMessageDialog(null, "your compputer has a virus", "Title", JOptionPane.WARNING_MESSAGE);

        // JOptionPane.showMessageDialog(null, "Call tech support", "Title", JOptionPane.ERROR_MESSAGE);


        // int answer = JOptionPane.showConfirmDialog(null, "Bro do you even code", "this is my titile", JOptionPane.YES_NO_CANCEL_OPTION);
        // String name =  JOptionPane.showInputDialog("Whats your name? : ");

        String[] responses = {"No, you're awsome!", "thank you!", "*blush"};

        JOptionPane.showOptionDialog(null,
                            "you are awsome", 
                            "secrete msg", 
                            JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.INFORMATION_MESSAGE, 
                            null, 
                            responses,
                            0);






    }
}
