package object_oriented_programming;

public class Employee implements Comparable, Workers {
    Employee(String nameString, String departmentString, String cityString, double salary) {
        name = nameString;
        this.salary = salary;
        department = departmentString;
        city = cityString;
        ID = IDNext;
        IDNext++;
    }

    Employee(String nameString) {
        this(nameString, "Human Resources", "Santo Domingo", 30000);
    }

    public String getNameString() {
        return name;
    }

    public String getDepartmentString() {
        return department;
    }

    public int getIdInt() {
        return ID;
    }

    public static int getNextID() {
        return IDNext;
    }

    public String getCityString() {
        return city;
    }

    public void setNewSalaryInt(double percentage) {
        salary += (percentage/100) + 1;
    }

    public double getSalaryDouble() {
        /**
         * Return the salary in double value.
         */
        return salary;
    }

    public int compareTo(Object _class) {
        Employee otherEmployee = (Employee) (_class);
        if (this.getSalaryDouble() > otherEmployee.getSalaryDouble()) {
            return 1;
        }

        if (this.getSalaryDouble() < otherEmployee.getSalaryDouble()) {
            return -1;
        }

        return 0;
    }

    public double setGratificationDouble(double mount) {
        // TODO Auto-generated method stub
        return Workers.gift + mount;
    }

 
    private String name, department, city;
    private int ID;
    private double salary;
    private static int IDNext = 1;
}