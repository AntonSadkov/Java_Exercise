/*
В цикле программа просит у пользователя ввести два числа и выводит результат их умножения.

После вывода результата умножения программа спрашивает, надо ли завершить выполнение.
И если пользователь введет число 1, то программа завершает цикл.
Если введено любое другое число, то программа продолжает спрашивать у пользователя два числа и умножать их.
 */

import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n;

        do {
            System.out.print("Введите первое число: ");
            double num1 = in.nextDouble();

            System.out.print("Введите второе число: ");
            double num2 = in.nextDouble();

            System.out.printf("%.2f * %.2f = %.2f", num1, num2, num1 * num2);

            System.out.println("Для выхода из программы нажмите 1, для продолжения нажмите любую другую цифру");
            n = in.nextInt();
        }
        while (n!=1);
        in.close();
    }
}
