package Assign8;

import java.util.Scanner;

public class Prob4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc .nextInt();
        if(leap(year)) System.out.println("True");
        else System.out.println("False");

    }
    public static boolean leap(int yr){
        if(yr%4==0 && yr%100!=0){//REMEMBER ABOUT 2100
            return true;
        }
        else if ((yr%100==0) && (yr%400==0)) {
            return true;
        }
        else return false;
    }
}
