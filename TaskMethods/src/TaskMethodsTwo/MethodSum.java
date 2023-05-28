package TaskMethodsTwo;

public class MethodSum {
    static void Sum(double ...nums){
        double z = 0;
        for (double n: nums) {
            z += n;
        }
        System.out.printf("Результат сложения: %.1f", z);
    }
}