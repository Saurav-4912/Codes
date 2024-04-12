package Codes;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int reverse=reverse(num);
        System.out.println("Reverse number is : " + reverse);
       
    }
    public static int reverse(int num){
        int count=0;
        while(num > 0){
            int remainder=num%10;
            count=(count*10) + remainder;
            num /=10;
        }
        return count;
    }
   
}

//output
/*enter the number
526
Reverse number is : 625 */
