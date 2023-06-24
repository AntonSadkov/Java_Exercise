package InheritanceTask2;

import InheritanceTask1.Employee;
import InheritanceTask1.Person;

public class D{

    public static void main(String[] args) {

        Person tom = new Person("Tom");
        tom.display();
        Person sam = new Employee("Sam", "Oracle");
        sam.display();
    }
}