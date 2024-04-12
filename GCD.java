package Codes;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number :");
        int first = sc.nextInt();
        System.out.println("enter the second number: ");
        int second = sc.nextInt();
        System.out.println("GCD is : " + greatestCommonDivisor(first, second));
    }

    public static int greatestCommonDivisor(int first, int second) {
        int gcd = 1;
        int count = 2;
        int least = least(first, second);
        while (count <= least){
            if (first % count == 0 && second % count == 0) {
                gcd = count;

            }
            count++;
        }

        return gcd;
    }

    public static int least(int first, int second) {
        if (first < second) {
            return first;
        } else {
            return second;
        }
    }
}

//output
/*enter the first number :
15
enter the second number: 
20
GCD is : 5 */
