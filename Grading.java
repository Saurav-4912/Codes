package Codes;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your percentage : ");
        float percentage=sc.nextFloat();

        if(percentage >= 90 ){
            System.out.println("you have got A");
        }else if(percentage >= 75 ){
            System.out.println("you have got B");
        }else if(percentage >= 60){
            System.out.println("you have got C");
        }else if(percentage  >= 30){
            System.out.println("you have got C");
        }else if(percentage <= 30){
            System.out.println(" Sorry , you are failed !!");
        }
    }
}

//output
/*Please enter your percentage : 
65
you have got C */