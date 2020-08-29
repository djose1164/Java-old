package gui;

import java.awt.Toolkit;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class Colors extends JFrame {
    
    public Colors() {
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    
        
        Toolkit screen = Toolkit.getDefaultToolkit();
        Dimension screenSize = screen.getScreenSize();

        screenWidth = screenSize.getWidth();
        screenHeigth = screenSize.getHeight();

        setSize((int) screenWidth / 2, (int) screenHeigth / 2);
        setLocation((int) screenWidth / 4, (int) screenHeigth / 4);


        InnerColors paneInnerColors = new InnerColors();
        add(paneInnerColors);
    }

    /**
 * InnerColors
 */
public class InnerColors extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            // TODO Auto-generated method stub
            super.paintComponent(g);

            Graphics2D graphics2d = (Graphics2D) g;

            Rectangle2D rectangle = new Rectangle2D.Double(screenWidth / 8, screenHeigth / 16, 
            screenWidth / 4, screenHeigth / 3);

            //draw with color the rectangle
            graphics2d.setPaint(Color.RED);
            graphics2d.fill(rectangle);

            Ellipse2D circle = new Ellipse2D.Double();
            circle.setFrame(rectangle);

            graphics2d.setPaint(Color.BLUE);
            graphics2d.fill(circle);

        }
    }

    private double screenWidth;
    private double screenHeigth;

}

