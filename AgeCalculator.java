package Codes;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your age : ");
        byte age=sc.nextByte();

        if(age >= 65){
            System.out.println("You are a senior");
        }else if(age>= 20){
            System.out.println("You are a adult");
        }else if(age >=13){
            System.out.println("You are a teenager");
        }else{
            System.out.println("You are a child");
        }
        
    }
}

//output
/*Please enter your age : 
45
You are a adult */
