package AbstractClassPerson;

import javax.swing.JOptionPane;

public class UsePerson {
    public static void main(String[] args) {
        Person people[] = new Person[3];

        for (int i = 0; i < people.length; i++) {
            if (i == 0) {
                people[i] = new Employee("El Brayan", 98500.65);    
            }
            
            if (i == 1) {
                people[i] = new Student("Jose Daniel", "Mechatronic Engineer");    
            }
            
            if (i == 2) {
                people[i] = new Employee("Ana Julia", 150600.80);    
            }
        }

        for (Person person : people) {
            JOptionPane.showMessageDialog(null, person.getDescription(), "Description", 
            JOptionPane.INFORMATION_MESSAGE);
        }
    }
}