package Codes;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first number : ");
      int a=sc.nextInt();
      System.out.println("Enter the second number : ");
      int b=sc.nextInt();

      int temp;
      temp=a;
      a=b;
      b=temp;

      System.out.println("Value of a is : " +a);
      System.out.println("Value of b is : " +b);

    }
}

/*Enter the first number : 
10
Enter the second number :
5
Addition : 15
Substrction : 5
Multiplication : 50
Division : 2
Modulo : 0 */
