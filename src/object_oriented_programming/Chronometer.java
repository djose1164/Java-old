package object_oriented_programming;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Chronometer {
    public static void main(String[] args) {
        ActionListener listener = new UseDate();

        Timer hourTimer = new Timer(5000, listener);
        hourTimer.start();
        JOptionPane.showMessageDialog(null, "Click on accept to stop", "Get hour and date", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
   
}