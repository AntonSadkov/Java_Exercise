package AbstractClassesTask1;

public class TaskOne {
    public static void main(String[] args) {

        Employee anton = new Employee("Anton", "T1-consulting");
        anton.display();
        Client anna = new Client("Anna", "Sberbank");
        anna.display();
    }
}