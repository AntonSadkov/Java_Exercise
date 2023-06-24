package InheritanceTask2;
public class DynamicMethodDispatch{

    public static void main(String[] args) {

        Person anton = new Person("Anton", 26);
        anton.display();
        anton.NumberOfYears();
        Person tester = new Employee("Anton tester", 26, "T1-consulting");
        tester.display();
        tester.NumberOfYears();
    }
}