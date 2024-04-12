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

//output
/*Enter the number :
5
5*1=5
5*2=10
5*3=15
5*4=20
5*5=25
5*6=30
5*7=35
5*8=40
5*9=45
5*10=50 */
