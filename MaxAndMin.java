package Codes;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr = Array.inputArray();
        int Maximum = Maximum(arr);
        int Minimum = Minimum(arr);
        System.out.println("Maximun number : " + Maximum);
        System.out.println("Minimum number : " + Minimum);
    }

    public static int Maximum(int[] arr) {
        int Max = arr[0];
        int i = 1;
        while (i < arr.length) {
            if (arr[i] > Max) {
                Max = arr[i];

            }
            i++;
        }
        return Max;
    }

    public static int Minimum(int[] arr) {
        int Min = arr[0];
        int i = 1;
        while (i < arr.length) {
            if (arr[i] < Min) {
                Min = arr[i];
            }
            i++;

        }

        return Min;
    }
}


//output
/*please enter the number of element 
5
please enter element no 1:
98
please enter element no 2:
57
please enter element no 3:
68
please enter element no 4:
12
please enter element no 5:
45
Maximun number : 98
Minimum number : 12 */
