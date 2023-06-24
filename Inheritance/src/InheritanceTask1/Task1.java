package InheritanceTask1;

public class Task1 {
    public static void main(String[] args) {

        Person anton = new Person("Anton");
        anton.display();

        Employee tester = new Employee("Anton Tester", "T1-consulting");
        tester.display(); /*Метод Display можно предопределить в классе наследнике Employee,
                          вывод у него будет отличаться от метода Display класса Person*/
        tester.work();
    }
}