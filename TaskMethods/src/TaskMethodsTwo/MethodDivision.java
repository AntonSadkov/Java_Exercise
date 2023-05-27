package TaskMethodsTwo;

public class MethodDivision {
    static void Division(double x, double y){
        double z = x / y;

        if (y == 0){
            System.out.println("Нельзя делить на 0!");
            return;
        }
        System.out.printf("Результат деления: %.1f", z);
    }
}