package TaskTwo;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args){
        try{
            Scanner in = new Scanner(System.in);

            System.out.println("Введите число меньше 30:");
            int x = in.nextInt();
            if(x>=30){
                throw new Exception("Число х должно быть меньше 30");
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Программа завершена");
    }
}