package gui;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class FirstFrame extends JFrame {
    public FirstFrame (final int x, final int y, final int width, final int height) {
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(x, y, width, height);
    } 
}