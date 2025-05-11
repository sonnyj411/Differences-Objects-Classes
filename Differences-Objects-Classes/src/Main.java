public class Main {
    public static void main(String[] args) {
        // Creating three Dog objects from the Dog class (instances)
        Dog dog1 = new Dog("Max", 3);
        Dog dog2 = new Dog("Bella", 5);
        Dog dog3 = new Dog("Charlie", 2);

        // Each object uses the same class structure, but has its own data
        dog1.bark(); // Max says: Woof!
        dog2.bark(); // Bella says: Woof!
        dog3.bark(); // Charlie says: Woof!

        // Print out each object's details
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
    }
}
