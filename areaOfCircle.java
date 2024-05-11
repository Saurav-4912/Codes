package Codes;

import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius : ");
        float radius=sc.nextFloat();

        double area= Math.PI * radius * radius;
        System.out.println("Area of circle is : " + area);

        double circumference= 2 * Math.PI * radius;
        System.out.println("Circumference of circle is : " +circumference);
    }
}

/*
 * output =
  Enter the radius : 
2
Area of circle is : 12.566370614359172
Circumference of circle is : 12.566370614359172
 */