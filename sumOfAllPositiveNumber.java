package Codes;

public class sumOfAllPositiveNumber {
    public static void main(String[] args) {
        long sumOfAllPositiveNumber = sumOfAllPositiveNumber();
        System.out.println("Sum of all positive number is : " + sumOfAllPositiveNumber);

    }

    public static long sumOfAllPositiveNumber() {

        int[] numbers = { -23, 34, 76, -78, -54, 32, -43, -56, 98, -12 };
        int sum = 0;
        for (int num : numbers) {
            if (num < 0) {
                
                continue;
            }
            sum += num;
        }
        return sum;
    }
}

/*output =
 * Sum of all positive number is : 240
 */
