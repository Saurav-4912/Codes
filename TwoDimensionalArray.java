package Codes;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr={{2,4,6},{8,10,12},{14,16,18}};
        //System.out.println(arr[0].length);
      
        System.out.println("Two Dimensional Array");
        int i=0;
        while(i < arr.length){
          int  j=0;
            while( j < arr[i].length){
              System.out.print(arr[i][j] + " ");
              j++;
            }
            System.out.println();
            i++;
        }
    }
}

//output
/* Two Dimensional Array
2 4 6 
8 10 12
14 16 18*/
