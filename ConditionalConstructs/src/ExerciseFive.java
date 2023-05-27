/*
Пусть пользователь кроме номера операции вводит два числа,
и в зависимости от номера операции с введенными числами выполняются определенные действия
(например, при вводе числа 3 числа умножаются).
Результат операции выводиться на консоль.
 */

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = in.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = in.nextDouble();

        System.out.print("""
                Введите номер операции:
                1.Сложение
                2.Вычитание
                3.Умножение
                4.Деление
                Введите номер операции:\s""");
        int operation = in.nextInt();

        if (operation == 4 && num2 == 0){
            System.out.println("Нельзя делить на 0!");
            return;
        }

        switch (operation) {
            case 1 -> {
                double sum = num1 + num2;
                System.out.printf("Операция сложения: %.3f", sum);
            }
            case 2 -> {
                double subtraction = num1 - num2;
                System.out.printf("Операция вычитания: %.3f", subtraction);
            }
            case 3 -> {
                double multiplication = num1 * num2;
                System.out.printf("Операция умножения: %.3f", multiplication);
            }
            case 4 -> {
                double division = num1 / num2;
                System.out.printf("Операция деления: %.3f", division);
            }
            default -> System.out.print("Операция не определена");
        }
    }
}
