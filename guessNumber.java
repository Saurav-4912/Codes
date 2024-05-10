package Codes;

import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 25, guessNumber;
        do {
            System.out.println("please enter the guessing number betwwen 1 to 50 : ");
            guessNumber = sc.nextInt();

        } while (number != guessNumber);
        System.out.println("You have successfully guessed the number ");

    }
}

/*output =
 * please enter the guessing number betwwen 1 to 50 : 
25
You have successfully guessed the number
 */
