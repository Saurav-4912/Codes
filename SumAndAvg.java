package Codes;

public class SumAndAvg {
    public static void main(String[] args) {
      //  System.out.println("Welcome to array sum and average");
        int[] number = Array.inputArray();
        long sum = sum(number);
      double average = average(number);
        System.out.println("Sum of arrry is : " + sum);
        System.out.println("Average of arrry is : " + average);
    }

    public static long sum(int[] number) {
        int sum = 0;
        int i = 0;
        while (i < number.length) {
            // System.out.println(number[i]);
            sum += number[i];
            i++;
        }

        return sum;
    }

    public static double average(int[] number) {
        long sum = sum(number);

        return (double) (sum / number.length);
    }
}


//output
/*please enter the number of element 
5
please enter element no 1:
11
please enter element no 2:
22
please enter element no 3:
33
please enter element no 4:
44
please enter element no 5:
55
Sum of arrry is : 165
Average of arrry is : 33.0 */