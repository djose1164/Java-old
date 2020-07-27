package object_oriented_programming;

public class Boss extends Employee implements Bosses {
    
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

    public String takeDesicionString(String desicionString) {
        return "A member from the direction has token a desicion of: " + desicionString;
    }

    public double setGratificationDouble(double mount) {
        double raw = 2000;

        return raw + mount + Workers.gift;
    }

    private double incentive;
}