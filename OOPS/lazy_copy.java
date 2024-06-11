public class lazy_copy {
    public static void main(String[] args) {
        // Creating an object using the constructor
        Person person1 = new Person("Alice", 30);

        // Creating a lazy copy when needed
        Person lazyPerson = person1.lazyCopy();

        // Displaying information
        System.out.println("Person 1: Name - " + person1.getName() + ", Age - " + person1.getAge());
        System.out.println("Lazy Copy: Name - " + lazyPerson.getName() + ", Age - " + lazyPerson.getAge());
    }
}
class Person {
    private String name;
    private int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Lazy copy method
    public Person lazyCopy() {
        // Creating a new object only when needed
        return new Person(this.name, this.age);
    }

    
}
