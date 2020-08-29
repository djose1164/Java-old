package AbstractClassPerson;

public class Employee extends Person {
    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
        this.name = name;
        Id = IdNext;
        IdNext++;
    }

    public String getDescription() {
        return "It's " + name + ". And he's an " +  "employeee with an ID " + Id + ". And with a salary of "
        + salary;
    }

    private String name;
    private double salary;
    private int Id;
    private static int IdNext = 1;
}