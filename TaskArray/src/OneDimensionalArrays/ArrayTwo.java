package OneDimensionalArrays;

public class ArrayTwo {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5};
        nums[4] = 26;
        //Длинна массива
        int length = nums.length;

        //Последний элемент массива
        int last = nums[nums.length-1];

        System.out.println(last);
        System.out.print(length);
    }
}
