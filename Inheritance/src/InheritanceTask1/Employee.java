package InheritanceTask1;

class Employee extends Person {
    String company;
    public  Employee(String name, String company){
        super(name);
        this.company = company;
    }
    public void work(){
        System.out.printf("%s работает в %s \n", getName(), company);
    }
    @Override
    public void display(){
        super.display();
        System.out.printf("Works in %s \n", company);
    }
}