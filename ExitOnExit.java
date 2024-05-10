package Codes;

import java.util.Scanner;

public class ExitOnExit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.print("Enter the your command : ");
            String command=sc.nextLine();
            if(command.equals("exit")){
                   break;    
            }
        }
        System.out.println("You have successfully exited");
    }
}

/*output =
 * Enter the your command : jump
Enter the your command : run
Enter the your command : exit
You have successfully exited
 */
