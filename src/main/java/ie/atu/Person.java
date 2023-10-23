package ie.atu;

public class Person {
    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}

