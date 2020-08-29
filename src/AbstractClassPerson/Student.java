package AbstractClassPerson;

public class Student extends Person {
    public Student(String name, String major) {
    super(name);
    this.name = name;
    this.major = major;
    }

    public String getDescription() {
        return "It's " + name + ". He's a student, who is studying " + major + ".";
    }

    private String name;
    private String major;
}