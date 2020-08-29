import java.awt.GraphicsEnvironment;

import javax.swing.JOptionPane;

public class SearchFont 
{
    public static void main(String[] args) 
    {
    
        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();


        String guess = JOptionPane.showInputDialog(null, "Enter the font to seach.");

        boolean value = false;
        
        for (String font: fonts) 
        {

            if (font.equals(guess)) 
            {
                value = true;
                break;
            }
        }

        if (value) 
        {
            JOptionPane.showMessageDialog(null, "Your font has been found! ", "Done", 
            JOptionPane.INFORMATION_MESSAGE);
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Your font hasn't been found!", "Error", 
            JOptionPane.INFORMATION_MESSAGE);        
        }

    }
}
