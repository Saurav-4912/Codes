package Codes;

import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Sum of all digit : " + sum(num));

    }

    public static int sum(int num) {
        int count = 0;
        while (num > 0) {
            int remainder = num % 10;
            count = count + remainder;

            num = num / 10;
        }
        return count;
    }
}

//output
/*Enter the number : 
456
Sum of all digit : 15 */