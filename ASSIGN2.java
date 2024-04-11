package Codes;

import java.util.Scanner;

public class ASSIGN2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number=sc.nextInt();

        if(number%2==0){
            System.out.println("Given number is even");
        }else{
            System.out.println("Given number is odd");
        }
    }
}

//output
/*Enter the number : 
56
Given number is even */