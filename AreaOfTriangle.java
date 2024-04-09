package Codes;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your base in cms :");
        double base=sc.nextDouble();
        System.out.println("Enter your hight in cms : ");
        double height=sc.nextDouble();

        double area=0.5 * base * height;

        System.out.println("Area of triangle is : " + area);
    }
}

//output
/*Enter your base in cms :
1.5
Enter your hight in cms :
2.5
Area of triangle is : 1.875 */
