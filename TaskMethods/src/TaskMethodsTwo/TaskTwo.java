package TaskMethodsTwo;

import java.util.Scanner;

public class TaskTwo{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = in.nextDouble();

        System.out.print("Введите второе число: ");
        double b = in.nextDouble();

        System.out.print("""
                Введите номер операции:
                1.Сложение
                2.Вычитание
                3.Умножение
                4.Деление
                Введите номер операции:\s""");
        int operation = in.nextInt();

        switch (operation){
            case 1 ->{
                MethodSum.Sum(a,b);
            }
            case 2 ->{
                MethodSubtraction.Subtraction(a,b);
            }
            case 3 ->{
                MethodMultiplication.Multiplication(a,b);
            }
            case 4 ->{
                MethodDivision.Division(a,b);
            }
            default -> System.out.print("Операция не определена");
        }
    }
}