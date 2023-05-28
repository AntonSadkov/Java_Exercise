package TaskMethodsThree;

public class MethodSumIndefiniteLength {
    static void Sum(double ...nums) {
        double result = 0;
        for (double n: nums){
            result += n;
        }
        System.out.printf("Результат сложения чисел: %.1f", result);
    }
}