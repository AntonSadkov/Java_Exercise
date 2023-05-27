package TaskMethodsOne;

public class TaskOne {
    public static void main(String[] args) {
        //Вызов static метода.
        HelloClass.Hello();

        //Вызов not static метод.
        WelcomeClass w = new WelcomeClass();
        w.Welcome();
    }
}