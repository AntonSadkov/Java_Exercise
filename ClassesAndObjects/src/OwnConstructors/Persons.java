package OwnConstructors;

public class Persons {

    String name;
    int age;

    Persons(){
        name = "Anton";
        age = 26;
    }

    Persons(String n){
        name = n;
        age = 18;
    }

    Persons(String n, int a){
        name = n;
        age = a;
    }

    public void DisplayInfo(){
        System.out.printf("\nName: %s \tAge: %d\n", name, age);
    }
}