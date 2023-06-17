package Initializers;

public class Initializers {
    public static void main(String[] args){
        InitializersPerson anton = new InitializersPerson();
        anton.DisplayInfo();

        InitializersPerson anna = new InitializersPerson("Anna");
        anna.DisplayInfo();

        InitializersPerson daniel = new InitializersPerson("Daniel", 25);
        daniel.DisplayInfo();
    }
}