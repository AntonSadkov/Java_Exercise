/*
Перепишите предыдущую программу, только вместо цикла for используйте цикл while.
*/

import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Введите сумму вклада: ");
        float sum = in.nextFloat();

        System.out.print("Введите количество месяцев: ");
        int month = in.nextInt();

        int i = 1;
        while (i <= month){
            sum += sum / 100 * 7;
            i++;
        }
        System.out.printf("После %d месяцев, сумма вклада будет равна %.3f", month, sum);
        in.close();
    }
}