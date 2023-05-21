/*
Напишите консольную программу,
в которой пользователь с клавиатуры вводит два числа.
А программа сранивает два введенных числа и выводит на консоль результат сравнения
(два числа равны, первое число больше второго или первое число меньше второго).
 */
import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number one: ");
        int num1 = in.nextInt();
        System.out.print("Input number two: ");
        int num2 = in.nextInt();

        if(num1 > num2)
        {
            System.out.println("Первое число больше второго");
        }
        else if(num1 < num2)
        {
            System.out.println("Второе число больше первого");
        }
        else
        {
            System.out.println("Числа равны");
        }
        in.close();
    }
}