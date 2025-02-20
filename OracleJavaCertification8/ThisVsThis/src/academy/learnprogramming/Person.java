package academy.learnprogramming;

public class Person {

    private String firstName;
    private String lastName;

    public Person() {
        this("Eric", "Johnson");
    }

    public Person(String firstName, String last) {
//        this(); // calls first constructor, will cause an error
        this.firstName = firstName;
//        this.lastName = last;
//        String lastName = "myName";
        lastName = last;
    }

    public void setFirstName(String firstName) {
//        this(); // can only be used in constructors
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFullName() {
//        return this.firstName + " " + this.lastName;
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
//        Person person = new Person("Zander", "Kotze");

    }
}
