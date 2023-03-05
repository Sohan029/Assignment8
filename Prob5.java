package Assign8;

import java.util.Scanner;

public class Prob5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(Small(a,b,c));

    }
    public static int Small(int a,int b,int c){
        if(a<=b && a<=c){
            return a;
        }
        else if (b<=a && b<=c) {
            return b;
        }
        else{
            return c;
        }
    }
}
