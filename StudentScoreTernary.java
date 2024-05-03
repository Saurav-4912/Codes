package Codes;

import java.util.Scanner;

public class StudentScoreTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score : ");
        int score = sc.nextInt();

        String category = score > 80 ? "High" : (score > 50 ? "Moderate" : "Low");
        System.out.println(" Your category is :" + category);
    }
}
/*
 * output
 * Enter the score :
 * 50
 * Your category is :Low
 */