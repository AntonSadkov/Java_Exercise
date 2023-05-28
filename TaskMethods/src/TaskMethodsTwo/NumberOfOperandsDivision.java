package TaskMethodsTwo;

import TaskMethodsThree.AmountOfNumbers;
import java.util.Scanner;

public class NumberOfOperandsDivision {
    static void OperandsDivision(){
        Scanner in = new Scanner(System.in);

        int num = AmountOfNumbers.Numbers();

        if (num == 2){
            System.out.print("Введите первое число: ");
            double a = in.nextDouble();

            System.out.print("Введите второе число: ");
            double b = in.nextDouble();

            MethodDivision.Division(a,b);
        }
        else if (num == 3) {
            System.out.print("Введите первое число: ");
            double a = in.nextDouble();

            System.out.print("Введите второе число: ");
            double b = in.nextDouble();

            System.out.print("Введите третье число: ");
            double c = in.nextDouble();

            MethodDivision.Division(a,b,c);
        }
        else if (num == 4) {
            System.out.print("Введите первое число: ");
            double a = in.nextDouble();

            System.out.print("Введите второе число: ");
            double b = in.nextDouble();

            System.out.print("Введите третье число: ");
            double c = in.nextDouble();

            System.out.print("Введите четвёртое число: ");
            double d = in.nextDouble();

            MethodDivision.Division(a,b,c,d);
        }
        else if (num == 5) {
            System.out.print("Введите первое число: ");
            double a = in.nextDouble();

            System.out.print("Введите второе число: ");
            double b = in.nextDouble();

            System.out.print("Введите третье число: ");
            double c = in.nextDouble();

            System.out.print("Введите четвёртое число: ");
            double d = in.nextDouble();

            System.out.print("Введите пятое число: ");
            double e = in.nextDouble();

            MethodDivision.Division(a,b,c,d,e);
        }
    }
}