package Codes;

import java.util.Scanner;

public class sumOfOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        System.out.println("Sum of all odd number : " + sum(num));

    }

    public static int sum(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                count += i;

            }

        }
        return count;

    }

}


//output
/*Enter the number :
50
Sum of all odd number : 625 */