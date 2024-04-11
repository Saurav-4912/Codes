package Codes;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int number1 = sc.nextInt();
        System.out.println("Enter Second Number :");
        int number2 = sc.nextInt();
        System.out.println("Enter Third number :");
        int number3 = sc.nextInt();

        if(number1>number2 && number1>number3){
            System.out.println( number1 +  " " +" is a greater number ");
        }else if(number2>number1 && number2>number3){
            System.out.println(number2 + " " + " is s greater number ");
        }else {
            System.out.println(number3 + " " + "is a greater number ");
        }

    }
}

//output
/*Enter First Number :
57
Enter Second Number :
98
Enter Third number :
23
98  is s greater number */