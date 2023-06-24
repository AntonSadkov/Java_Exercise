package InnerAndNestedClassesTask1;

public class Task1 {
    public static void main(String[] args){

        Person anton = new Person("Anton", "qwerty");
        anton.displayPerson();
        anton.account.displayAccount();
    }
}
