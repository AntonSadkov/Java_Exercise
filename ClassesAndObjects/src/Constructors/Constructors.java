package Constructors;
public class Constructors {
    public static void main(String[] args) {

        Person anton = new Person();    // Создаём экземпляр класса Person

        anton.name = "Anton";   //Задаём имя
        anton.age = 26;     //Задаём возраст
        anton.DisplayInfo();    //Вызываем метод
    }
}