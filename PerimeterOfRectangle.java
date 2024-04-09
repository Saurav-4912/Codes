package Codes;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter all 4 sides in cms : ");
        double side1=sc.nextDouble();
        double side2=sc.nextDouble();
        double side3=sc.nextDouble();
        double side4=sc.nextDouble();

        System.out.println("Perimater of Rectangle is : " +(side1+side2+side3+side4));
    }
}

//output
/*Enter all 4 sides in cms : 
4.5
3 
4.5
3
Perimater of Rectangle is : 15.0 */
