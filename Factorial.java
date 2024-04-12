package Codes;

import java.util.Scanner;

public class Factorial {
    private static int fact;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
 System.out.println("factorial is : " +factorial(num));

    }

    public static long factorial(int num) {

        if(num < 2){
            return 1;
        }
        long fact=1;
        int i=2;
        while(i <= num){
            fact *= i;
            i++;

        }
        return fact;
        

    }
}


//output
/*Enter the number : 
4
factorial is : 24 */