package Adapter;

public class PersonTXT {
    private String name;
    private int age;

    public PersonTXT(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public final String getName() {
        return name;
    }

    public final int getAge() {
        return age;
    }
}
