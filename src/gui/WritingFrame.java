package gui;

import java.awt.Graphics;

import javax.swing.JPanel;

public class WritingFrame extends JPanel{
    
    @Override
    public void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);

        g.drawString("Holaaaa", 100, 100);
    }
}