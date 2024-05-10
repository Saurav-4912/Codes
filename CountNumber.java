package Codes;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int number=sc.nextInt();
        int countNumber=countNumber(number);
        System.out.println("Your element was found " + countNumber + " " + "times");
       

    }
    public static int countNumber(int number){
        int[] numbers={12,24,36,48,12,24,89,24,79};
        int count=0;
        for(int num : numbers){
            if(num == number){
                count++;
            }
        }
        return count;


    }
}

/*output =
 * Please enter the number : 
24
Your element was found 3 times
 */