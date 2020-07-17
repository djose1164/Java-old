import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String city, name, department;
        Employee[] myArraEmployees = new Employee[2];
        int i = 1;

        for (int j = 0; j < myArraEmployees.length; j++) {
            name = JOptionPane.showInputDialog(null, "Type employee's name", "Employee's name. " + i, JOptionPane.INFORMATION_MESSAGE);
            department = JOptionPane.showInputDialog(null, "Type employee's department", "Employee's department. " + i, JOptionPane.INFORMATION_MESSAGE);
            city = JOptionPane.showInputDialog(null, "Type employee's city", "Employee's city. " + i, JOptionPane.INFORMATION_MESSAGE);
            myArraEmployees[j] = new Employee(name);
            i++;
        }
        System.out.println("Hola " + Employee.getNextID());

        for (Employee employee : myArraEmployees) {
            JOptionPane.showMessageDialog(null, "The employee's name is: " + employee.getNameString() + "\nThe employee's department is " +
            employee.getDepartmentString() + "\nThe employee's id is: " + employee.getIdInt(), "Employee's Data", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
}
