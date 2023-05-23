package OneDimensionalArrays;

public class ArrayThree {
    public static void main(String[] args){
        String[] array = new String[] { "К\t", "О\t", "Л\t", "Б\t", "А\t", "C\t", "А" };
        int amount = array.length;

        for (String i : array){
            System.out.print(i);
        }
        System.out.println();
        System.out.printf("Длинна массива: %d", amount);
    }
}
