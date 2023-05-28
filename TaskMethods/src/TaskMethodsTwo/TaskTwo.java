package TaskMethodsTwo;

import java.util.Scanner;

public class TaskTwo{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

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
                NumberOfOperandsSum.OperandsSum();
            }
            case 2 ->{
                NumberOfOperandsSubtraction.OperandsSubtraction();
            }
            case 3 ->{
                NumberOfOperandsMultiplication.OperandsMultiplication();
            }
            case 4 ->{
                NumberOfOperandsDivision.OperandsDivision();
            }
            default -> System.out.print("Операция не определена");
        }
    }
}