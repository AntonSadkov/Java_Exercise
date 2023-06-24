package InheritanceTask2;

class Employee extends Person{

    String company;

    public Employee(String name, int age, String company) {

        super(name, age);
        this.company = company;
    }
    @Override
    public void display(){

        System.out.printf("Employee %s works in %s \n", super.getName(), company);
    }
}