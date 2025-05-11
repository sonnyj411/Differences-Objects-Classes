// This is a class – it defines the structure of Dog objects
public class Dog {
    // Instance variables – each object will have its own values
    private final String name;
    private final int age;

    // Constructor – used to create a Dog object
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method – defines behavior for Dog objects
    public void bark() {
        System.out.println(name + " says: Woof!");
    }

    // Override toString to print object details
    @Override
    public String toString() {
        return name + " is " + age + " years old.";
    }
}
