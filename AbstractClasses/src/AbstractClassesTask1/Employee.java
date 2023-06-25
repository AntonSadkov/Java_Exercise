package AbstractClassesTask1;

class Employee extends Person{

    private String bank;

    public Employee(String name, String company) {

        super(name);
        this.bank = company;
    }

    public void display(){

        System.out.printf("Имя сотрудника: %s \t Компания: %s \n", super.getName(), bank);
    }
}