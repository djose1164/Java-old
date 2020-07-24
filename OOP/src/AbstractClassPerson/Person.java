package AbstractClassPerson;

abstract public class Person {
    public Person(String name) {
        this.name = name;
    }

    public String getNameString() {
        return name;
    }

    public abstract String getDescription();

    private String name;
}