package Encapsulation;

import java.util.Scanner;
public class Encapsulation {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Введите имя:\t");
        String name = in.nextLine();
        System.out.print("Введите возраст:\t");
        int age = in.nextInt();

        Person person = new Person(name, age);

        System.out.println("\t" + "\t");
        System.out.println(person.getName());
        person.setName("Хуй"); //Спасибо инкапсуляция =)
        System.out.println(person.getAge());
        person.setAge(777);
    }
}