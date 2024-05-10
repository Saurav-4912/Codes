package Codes;

import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number :");
        int number = sc.nextInt();
        System.out.println("Table of " + number);
        for (int i = 1; i <= 10; i++) {
            int result = number * i;

            System.out.println(number + " " + "*" + " " + i + " " + "=" + " " + result);
        }

    }

}
/*output =
 * please enter the number :
15
Table of 15
15 * 1 = 15
15 * 2 = 30
15 * 3 = 45
15 * 4 = 60
15 * 5 = 75
15 * 6 = 90
15 * 7 = 105
15 * 8 = 120
15 * 9 = 135
15 * 10 = 150
 */
