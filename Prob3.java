package Assign8;

import java.util.Scanner;

public class Prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Middle(str);
    }

    public static void Middle(String str){
        int len = str.length();
        int mid = len/2;
        if(len%2==0){
            System.out.print(str.charAt(mid-1));
            System.out.println(str.charAt(mid));
        }
        else{
            System.out.println(str.charAt(mid));
        }
    }
}
