public class Person {

    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display Method
    public void displayPerson() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}