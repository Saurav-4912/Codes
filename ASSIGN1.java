package Codes;

import java.util.Scanner;

public class ASSIGN1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int Number = sc.nextInt();

        if (Number > 0) {
            System.out.println("Given number is positive");
        } else if (Number < 0) {
            System.out.println("Given number is negative");
        } else {
            System.out.println("Given number is zero");
        }
    }
}

//output
/*Enter the number : 
-70
Given number is negative */