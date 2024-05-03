package Codes;
import java.util.Scanner;;

public class minimumOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int number1=sc.nextInt();
        System.out.println("Enter the second number : ");
        int number2=sc.nextInt();

        int minimumNumber= number1 < number2 ? number1 : number2;
        System.out.println(minimumNumber + " is the minimum number" );

    }
}


/* output
 Enter the first number : 
12
Enter the second number :
15
12 is the minimum number */
