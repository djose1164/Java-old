public class Employee {
    Employee(String nameString, String departmentString, String cityString) {
        name = nameString;
        department = departmentString;
        city = cityString;
        ID = IDNext;
        IDNext++;
    }

    Employee(String nameString) {
        this(nameString, "Human Resources", "Santo Domingo");
    }

    private String name, department, city;
    private int ID;
    private static int IDNext = 1;

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
}