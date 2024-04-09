package Codes;

import java.util.Scanner;

public class Arthematic {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the first number : ");
        int FirstNumber=sc.nextInt();
        System.out.println("Enter the second number : ");
        int SecondNumber=sc.nextInt();

        //Addition
        System.out.println("Addition : " + (FirstNumber + SecondNumber));

        //Substrction
        System.out.println("Substrction : " + (FirstNumber - SecondNumber));

        //Multiplication
        System.out.println("Multiplication : " + (FirstNumber * SecondNumber));

        //Division
        System.out.println("Division : " + (FirstNumber / SecondNumber));

        //Modulo
        System.out.println("Modulo : " + (FirstNumber % SecondNumber));
    }
 
    
}

//output
/*Enter the first number : 
10
Enter the second number :
5
Addition : 15
Substrction : 5
Multiplication : 50
Division : 2
Modulo : 0 */
