package InheritanceTask2;

class Person {

    String name;
    int age;

    public String getName() { return name; }

    public Person(String name, int age){

        this.name = name;
        this.age = age;
    }

    public void display(){

        System.out.printf("Person %s \n", name);
    }

    public final void NumberOfYears(){
        System.out.printf("Возраст %d \n", age);
    }
}