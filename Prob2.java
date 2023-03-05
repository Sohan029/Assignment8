package Assign8;


import java.util.Scanner;

class Vowels{
    Vowels(String str){
        int len =str.length();
        int count = 0;
        for(int i=0;i<len;i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println(count);
    }

}
public class Prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Vowels obj1 = new Vowels(str);
//        Vowels(str);

    }
}
