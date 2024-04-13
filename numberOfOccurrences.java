package Codes;

import java.util.Scanner;

public class numberOfOccurrences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] number = Array.inputArray();

        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int count = count(number, num);
        System.out.println("element was found " + count + " " + "times in array");
    }

    public static int count(int[] number, int num) {
        int i = 0;
        int count = 0;
        while (i < number.length) {
            if (number[i] == num) {
                count++;

            }
            i++;
        }

        return count;
    }
}


//output
/*please enter the number of element 
10
please enter element no 1:
57
please enter element no 2:
76
please enter element no 3:
89
please enter element no 4:
45
please enter element no 5:
57
please enter element no 6:
87
please enter element no 7:
45
please enter element no 8:
45
please enter element no 9:
23
please enter element no 10:
12
Enter the number :
45
element was found 3 times in array */