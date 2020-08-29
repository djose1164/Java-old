package gui;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import java.awt.Toolkit;
import java.awt.Dimension;

class WritableFrame extends JFrame{

    public WritableFrame() {
        Toolkit screen = Toolkit.getDefaultToolkit();
        Dimension screenSize = screen.getScreenSize();

        setSize((int)(screenSize.getWidth()) / 2, (int)(screenSize.getHeight()) / 2);
        setLocation((int)(screenSize.getWidth()) / 4, (int)(screenSize.getHeight()) / 4);
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        WritingFrame write = new WritingFrame();
        add(write);

        setTitle("Writable Frame");
    }

}