package object_oriented_programming;

import javax.swing.JOptionPane;

public class PedroEmployee {
    public static void main(String[] args) {
        Employee Pedro = new Employee("Pedro Martinez");
        JOptionPane.showMessageDialog(null, "The employee " + Pedro.getNameString() + " has a gift of " + 
        Pedro.setGratificationDouble(500) + " dollars.", "Employee's infromation", JOptionPane.INFORMATION_MESSAGE);

        Employee Maria = new Boss("Maria Luna", "CEO", "Santo Domingo", 150500);
        JOptionPane.showMessageDialog(null, "The employee " + Maria.getNameString() + " has a gift of " + 
        Maria.setGratificationDouble(5000) + " dollars.", "Employee's infromation", JOptionPane.INFORMATION_MESSAGE);

    }
}