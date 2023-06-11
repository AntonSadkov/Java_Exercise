package TaskMethodsFour;

import java.util.Scanner;

public class TaskFour{

    public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Введите время дня: ");
        int TD = in.nextInt();

        System.out.println(DayTime.TimeOfDay(TD));
    }
}