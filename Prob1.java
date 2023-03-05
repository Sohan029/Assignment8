package Assign8;

import java.util.Scanner;

class solution{
    solution(int a,int b,int c){
        int avg = (a+b+c)/3;
        System.out.println("Average : "+avg);
//        return avg;
    }
}
public class Prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        solution obj1 = new solution(a,b,c);
//        System.out.println(obj1.solution());
    }
}
