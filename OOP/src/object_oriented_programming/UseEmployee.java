package object_oriented_programming;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class UseEmployee {
    public static void main(String[] args) {
        Employee myEmployee[] = new Employee[4];
        Boss djoseBoss = new Boss("Jose Daniel", "President", "Santo Domingo", 509500);
        djoseBoss.setIncentive(5509.100);

        JOptionPane.showMessageDialog(null, djoseBoss.takeDesicionString("More work for everyone! :D"));

        for (int i = 0; i < myEmployee.length; i++) {
            myEmployee[i] = new Employee(JOptionPane.showInputDialog(null, "Type employee's name", "Name", JOptionPane.INFORMATION_MESSAGE));

            if (i == 2) {
                myEmployee[i] = new Boss("Maria", "CEO", "Santo Domingo", 305500);
            }

            if (i == 3) {
                myEmployee[i] = djoseBoss;
            }
        }
        //Here
        Boss ceoBoss = (Boss)(myEmployee[2]);
        JOptionPane.showMessageDialog(null, "The ceoBoss's salary is " + ceoBoss.getSalaryDouble() + "The id is" + ceoBoss.getIdInt());
        for (Employee employee : myEmployee) {
            employee.setNewSalaryInt(5);
        }
     
        Arrays.sort(myEmployee);

        for (Employee employee : myEmployee) {
            JOptionPane.showMessageDialog(null,"The employee's id is " + employee.getIdInt() + ".\n The employee's name is " + 
            employee.getNameString() + ".\n The employee's carge is " + employee.getDepartmentString() + ".\n The employee's city is " + 
            employee.getCityString() + ".\n The employee's salary is " + employee.getSalaryDouble(), "General Datas", 
            JOptionPane.INFORMATION_MESSAGE);
        }
    }
}