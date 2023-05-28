package TaskMethodsTwo;

public class MethodDivision {
    static void Division(double a, double b){
        double z = a / b;

        if (b == 0){
            System.out.println("Нельзя делить на 0!");
            return;
        }
        System.out.printf("Результат деления: %.1f", z);
    }
    static void Division(double a, double b, double c){
        double z = a / b / c;

        if (b == 0 || c == 0){
            System.out.println("Нельзя делить на 0!");
            return;
        }
        System.out.printf("Результат деления: %.1f", z);
    }
    static void Division(double a, double b, double c, double d){
        double z = a / b / c / d;

        if (b == 0 || c == 0 || d == 0){
            System.out.println("Нельзя делить на 0!");
            return;
        }
        System.out.printf("Результат деления: %.1f", z);
    }
    static void Division(double a, double b, double c, double d, double e){
        double z = a / b / c / d;

        if (b == 0 || c == 0 || d == 0 || e == 0){
            System.out.println("Нельзя делить на 0!");
            return;
        }
        System.out.printf("Результат деления: %.1f", z);
    }
}