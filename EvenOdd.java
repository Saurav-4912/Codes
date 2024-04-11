package Codes;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Please enter the number : ");
        int number=sc.nextInt();

        if((number & 1) == 1){
            System.out.println("Given number is odd");
        }else{
            System.out.println("Given number is even");
        }
    }
}


//output
/*Please enter the number : 
3
Given number is odd */