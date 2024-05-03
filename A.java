package Codes;

public class A {
    int i;
    int j;
    A(){
        System.out.println("i am in constructor");
      i=  11; j=12;
    }
    @Override
    protected void finalize(){
        System.out.println("i am in finalize");
    }
    public static void main(String[] args) {
        A ob=new A();
        ob=null;
        System.gc();
    }
}
