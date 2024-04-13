package Codes;

public class Pattern1 {
    public static void main(String[] args) {
        firstPattern();
        secondPattern();
        thirdPattern();
        
    }
    public static void firstPattern(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
              System.out.print("*");

            }
            System.out.println();
        }
    }
    public static void secondPattern(){
        for(int i=1; i<=5; i++){
            for(int j=5; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void thirdPattern(){
        for(int i=1; i<=5; i++){
            for(int j=4; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k>=i; k--){
            System.out.println("*");
            }
        }
        System.out.println();
    }
}
