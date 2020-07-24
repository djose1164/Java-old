package object_oriented_programming;

public class Boss extends Employee {
    
    public Boss(String nameString, String departmentString, String cityString, double salary) {
        super(nameString, departmentString, cityString, salary);
    }

    public void setIncentive(double incentive) {
        this.incentive = incentive;
    }

    public final double getSalaryDouble() {
        incentive += super.getSalaryDouble();
        return incentive;
    }

    private double incentive;
}