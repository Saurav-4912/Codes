package Codes;

import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the first number : ");
        int FirstNumber=sc.nextInt();
        System.out.println("Enter the second number : ");
        int SecondNumber=sc.nextInt();

        int Total=FirstNumber + SecondNumber;
        System.out.println(Total);
    }
   

}