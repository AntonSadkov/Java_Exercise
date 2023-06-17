package Initializers;

public class InitializersPerson {

    String name;    // имя
    int age;        // возраст

    {
        name = "Anton";
        age = 26;
    }

    InitializersPerson(){}

    InitializersPerson(String name){
        this(name, 18);
    }

    InitializersPerson(String name, int age){
        this.name = name;
        this.age = age;
    }

    void DisplayInfo(){
        System.out.printf("\nName: %s \tAge: %d\n", name, age);
    }
}