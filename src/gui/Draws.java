package gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;


public class Draws {
    
    public static void main(String[] args) {
       InnerDraws draw = new InnerDraws();
       draw.setTitle("Drawing :D");
    }
}

/**
 * InnerDraws
 */
class InnerDraws extends JFrame{

    public InnerDraws() {
        Toolkit screen = Toolkit.getDefaultToolkit();
        Dimension screenSize = screen.getScreenSize();
        setSize((int) (screenSize.getWidth()) / 2, (int) (screenSize.getHeight()) / 2);

        setVisible(true);

        setLocation(100, 200);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        InnerDraws_1 rectangle = new InnerDraws_1();
        add(rectangle);

    }

}

/**
 * InnerDraws_1
 */
class InnerDraws_1 extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);

        //Draw a rectangle 100x100
        //g.drawRect(50, 50, 500 / 2, 500 / 2);

        Graphics2D gGraphics2d = (Graphics2D) (g);

        Rectangle2D rectangle2d = new Rectangle2D.Double(50, 50, (double) 500 / 2, (double) 350 / 2);

        gGraphics2d.draw(rectangle2d);

        gGraphics2d.draw(new Ellipse2D.Double(50, 50, (double) 500 / 2, (double) 350 / 2));

        gGraphics2d.draw(new Line2D.Double(50, 50, (double) (500 / 2) + 50, (double) (350 / 2) + 50));

    }
}