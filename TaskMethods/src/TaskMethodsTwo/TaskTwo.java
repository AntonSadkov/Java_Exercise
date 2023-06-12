package TaskMethodsTwo;

import java.util.Scanner;

public class TaskTwo{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("""
                    Введите номер операции:
                    1.Сложение
                    2.Вычитание
                    3.Умножение
                    4.Деление
                    Введите номер операции:\s""");
            int operation = in.nextInt();

            switch (operation) {
                case 1 -> {
                    NumberOfOperandsSum.OperandsSum();
                }
                case 2 -> {
                    NumberOfOperandsSubtraction.OperandsSubtraction();
                }
                case 3 -> {
                    NumberOfOperandsMultiplication.OperandsMultiplication();
                }
                case 4 -> {
                    NumberOfOperandsDivision.OperandsDivision();
                }
                default -> System.out.print("Операция не определена");
            }

            boolean w = true;
            int a;
            try {
                do {
                    System.out.println("\nХотите повторить?\nДа(Нажмите 1)\tНет(Нажмите 2)");
                    a = in.nextInt();

                    if (a == 1) {
                        System.out.println("Повторяем");
                        w = false;
                    } else if (a == 2) {
                        break;
                    } else {
                        System.out.println("Вводите корректные данные!");
                    }
                } while (w == true);
                if (a == 2) {
                    break;
                }
            }catch (java.util.InputMismatchException ex){
                System.out.println("Вводите корректные данные!");
                break;
            }
        }
    }
}