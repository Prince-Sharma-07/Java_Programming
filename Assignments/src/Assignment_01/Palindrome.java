package Assignment_01;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.print("Please enter a string: ");
        String str = in.nextLine();
        String res = "";
        for(int i = str.length()-1; i>=0; i--){
            res = res + str.charAt(i);
        }
        System.out.println(res);
    }
}
