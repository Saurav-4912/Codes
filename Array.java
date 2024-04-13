package Codes;

import java.util.Scanner;

public class Array {
    public static int[] inputArray() {
        Scanner sc=new Scanner(System.in);
System.out.println("please enter the number of element ");
int size=sc.nextInt();

int[] number=new int[size];
for(int i=0; i<number.length; i++){
    System.out.println("please enter element no " + (i+1)+ ":");
    number[i]=sc.nextInt();
}
return number;
    }
}
