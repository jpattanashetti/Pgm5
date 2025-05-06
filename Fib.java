package Pgm5;

public class Fib {
    public static void main(String[] args){
        int count=10;
        int a=0,b=1;
        System.out.println("Fibonacci series"+count+"terms:");
        for(int i=1;i<=count;i++){
            System.out.println(a+" ");
            int next=a+b;
            a=b;
            b=next;
        }

    } 

}
