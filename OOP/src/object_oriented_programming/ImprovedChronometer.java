package object_oriented_programming;

import javax.swing.JOptionPane;

public class ImprovedChronometer {
    public static void main(String[] args) {
        Clock myclock = new Clock();
        myclock.onGoing(3000, true);
    
        JOptionPane.showMessageDialog(null, "Click on Ok to close the program.");
    
        System.exit(0);
    }
 
}