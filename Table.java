package Codes;

import java.util.Scanner;

public class Table {

    public static void multiplicationTable(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + "*" + i + "=" + (num * i));
            i++;

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        multiplicationTable(num);

    }
}
