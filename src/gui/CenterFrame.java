package gui;

import java.awt.Toolkit;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import java.awt.Dimension;

public class CenterFrame extends JFrame {
    public CenterFrame() {
        Toolkit screen = Toolkit.getDefaultToolkit();

        Dimension screenSize = screen.getScreenSize();

        //Positioning the frame in the center of the screen.
        setBounds((int)(screenSize.getWidth()/4), (int)(screenSize.getHeight()/4), (int)(screenSize.getWidth()/2), 
        (int)(screenSize.getHeight()/2));
        
        setVisible(true);

        setTitle("Positioning the frame in center of screen!");

        //Get icon to the window
        Image iconImage = screen.getImage("src/gui/apple_loli.png");
        
        //Set icon
        setIconImage(iconImage);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}