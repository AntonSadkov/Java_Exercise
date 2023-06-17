package KeywordThis;

public class ThisPerson {
    String name;
    int age;

    ThisPerson(){
        this("Anton", 26);
    }

    ThisPerson(String name){
        this(name, 18);
    }

    ThisPerson(String name, int age){
        this.name = name;
        this.age = age;
    }
    void DisplayInfo(){
        System.out.printf("\nName: %s \tAge: %d\n", name, age);
    }
}