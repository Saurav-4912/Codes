package Codes;

public class Sorting {
    public static void main(String[] args) {
        System.out.println("Welcome to sorting");
        int[] num = Array.inputArray();
        boolean isIncreasing = isIncreasing(num);
        boolean isDecreasing = isDecreasing(num);
        if (isIncreasing || isDecreasing) {
            System.out.println("Your array is sorted");
        } else {
            System.out.println("Your array is not sorted");
        }
    }

    public static boolean isIncreasing(int[] num) {
        int i = 1;

        while (i < num.length) {
            if (num[i] < num[i - 1]) {
                return false;
            }
            i++;
        }

        return true;
    }

    public static boolean isDecreasing(int[] num) {
        int i = 1;
        while (i < num.length) {
            if (num[i] > num[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}

//output
/*Welcome to sorting
please enter the number of element 
5
please enter element no 1:
52
please enter element no 2:
665
please enter element no 3:
85
please enter element no 4:
98
please enter element no 5:
45
Your array is not sorted */
