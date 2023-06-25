package AbstractClassesTask1;

class Client extends Person
{
    private String bank;

    public Client(String name, String company) {

        super(name);
        this.bank = company;
    }

    public void display(){

        System.out.printf("Имя клиента: %s \t Компания: %s \n", super.getName(), bank);
    }
}