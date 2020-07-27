package gui;

import javax.swing.JFrame;

public class FirstFrame extends JFrame {
    public FirstFrame (final int x, final int y, final int width, final int height) {
        //setSize(width, height);
        setVisible(true);
        //setLocation(x, y);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(x, y, width, height);
    } 
}