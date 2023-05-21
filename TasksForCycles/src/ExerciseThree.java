/*
За каждый месяц банк начисляет к сумме вклада 7% от суммы. Напишите консольную программу,
в которую пользователь вводит сумму вклада и количество месяцев.
А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.

Для вычисления суммы с учетом процентов используйте цикл for. Пусть сумма вклада будет представлять тип float.
*/

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Введите сумму вклада: ");
        float sum = in.nextFloat();

        System.out.print("Введите количество месяцев: ");
        int month = in.nextInt();

        for(int i = 1; i <= month; i++){
            sum += sum / 100 * 7;
        }
        System.out.printf("После %d месяцев, сумма вклада будет равна %.3f", month, sum);
        in.close();
    }
}
