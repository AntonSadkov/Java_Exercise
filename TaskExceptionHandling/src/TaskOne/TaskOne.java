package TaskOne;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        while(true) {
            try {
                int[] numbers = new int[3];
                numbers[4] = 45;
                System.out.println(numbers[4]);
            } catch (ArrayIndexOutOfBoundsException ex) {

                System.out.println("Выход за пределы массива");
            } finally {
                System.out.println("Блок finally");
            }
            System.out.println("Программа завершена");

            boolean w = true;
            int a;
            try {
                do {
                    System.out.println("Хотите повторить?\nДа(Нажмите 1)\tНет(Нажмите 2)");
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