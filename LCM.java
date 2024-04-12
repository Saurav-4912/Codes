package Codes;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number :");
        int first = sc.nextInt();
        System.out.println("enter the second number : ");
        int second = sc.nextInt();
        System.out.println("LCM is : " + sum(first, second));

    }

    public static int sum(int first, int second) {
        int i = 1;
        while (i <= second) {
            int factor = i * first;
            if (factor % second == 0) {
                return factor;
            }
            i++;
        }
        return 0;

    }
}


//output
/*enter the first number :
9
enter the second number :
10
LCM is : 90 */