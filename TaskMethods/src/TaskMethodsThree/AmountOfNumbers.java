package TaskMethodsThree;

import java.util.Scanner;

public class AmountOfNumbers {
    public static int Numbers(){
        Scanner in = new Scanner(System.in);
        System.out.print("Выберете количество чисел в выражении от 2 до 5: ");
        int num = in.nextInt();

        if (num == 2){
            return num;
        }
        else if (num == 3) {
            return num;
        }
        else if (num == 4) {
            return num;
        }
        else if (num == 5) {
            return num;
        }
        else {
            System.out.println("Недопустимое значение!");
            return 0;
        }
    }
}