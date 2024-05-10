package Codes;

public class MaxArray {
    public static void main(String[] args) {
        int[] array = { 23, 34, 32, 45, 54, 99, 12, 67, 89, 66 };
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;

            }
        }
        System.out.println("Maximum value of integer array is: " + max);
    }
}
