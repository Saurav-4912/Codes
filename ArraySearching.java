package Codes;

import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int[] arr={2,45,76,34,89,66,33,69,75,3};
        System.out.println("Enter the number : ");
        int number=sc.nextInt();
        boolean isFound=isFound(arr, number);
        if(isFound){
            System.out.println("Your number was found in the array");
        }else{
            System.out.println("Your number was not found in the array");
        }

    }
    public static boolean isFound(int[] arr, int number){
        int index=0;
        while(index < arr.length){
            if(arr[index] == number){
                return true;
            }
            index++;
        }
        return false;
    }
}


//output
/*Enter the number : 
66
Your number was found in the array */