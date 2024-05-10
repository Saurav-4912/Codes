package Codes;

import java.util.Scanner;

public class passwordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;
        do {
            System.out.println("Enter the password : ");
            password = sc.nextLine();
        } while (!isValidPassword(password));
        System.out.println("Thanks for entering the password ");

    }

    public static boolean isValidPassword(String password) {

        return password.length() > 6;
    }

}


/*output =
 * Enter the password : 
password
Thanks for entering the password 
 */